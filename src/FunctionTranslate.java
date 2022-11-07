import jdk.swing.interop.SwingInterOpUtils;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class FunctionTranslate extends CoralBaseListener {
    // Se declara un mapa para manejar los tipos de variables para el scanner
    Map<String, String> varTypeMap = new HashMap<String, String>();
    String varCheckType;
    Boolean proceed = true;
    Boolean go = true;

    // Regla inicial
    @Override
    public void enterInicio(CoralParser.InicioContext ctx){

        // Incluimos los imports necesarios
        System.out.println("import java.util.Random;");
        System.out.println("import java.util.Scanner;");
        System.out.println("import java.lang.Math;");
        // Iniciamos sacando el boilerplate
        System.out.println("public class Main\n" +
                "{\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\n" +
                "\t    // Este scanner se declara sin importar la funcionalidad del codigo\n" +
                "\t\tScanner coralScan = new Scanner(System.in); ");
    }

    @Override
    public void exitInicio(CoralParser.InicioContext ctx){
        System.out.println("\t}\n" +
                            "}");
    }

    // Traduccion de la declaracion de una variable en el programa
    @Override
    public void enterVariable_declaration(CoralParser.Variable_declarationContext ctx){
        // Identificamos el tipo de dato que vamos a recibir
        String dataType = ctx.tipo_dato().getText();
        // Traducimos el tipo dependiendo del tipo de dato necesario
        if (dataType.equals("integer")){
            System.out.print("int ");
            // Añadimos la variable al mapa de tipos
            varTypeMap.put(ctx.ID().getText(), "integer");
        } else{
            System.out.print("double ");
            // Añadimos la variable al mapa de tipos
            varTypeMap.put(ctx.ID().getText(), "double");
        }

        // Añadimos el ID y el ; para terminar la traduccion

        if (!ctx.es_arreglo().getText().isBlank()){
            //Si es un arreglo colocamos el tamaño
            String tamano = ctx.es_arreglo().tamano_arreglo().getText();
            System.out.println(ctx.ID().getText() + "[" + tamano + "];");
        }else {
            System.out.println(ctx.ID().getText() + ";");
        }
    }

    // Traduccion de un identificador para asignacion
    @Override
    public void enterId_asg(CoralParser.Id_asgContext ctx){

        if(ctx.asignacion().getChild(0).getText().equals(".size")){
            proceed = false;
            go = true;
            return;
        }
        System.out.print(ctx.ID());
    }

    @Override
    public void exitId_asg(CoralParser.Id_asgContext ctx){
        // System.out.println(";");
    }

    // Traduccion de acceso a un arreglo de la forma id[x]
    @Override
    public void enterArray_access(CoralParser.Array_accessContext ctx){
        if(!proceed || !go){
            proceed = true;
            go = true;
            return;
        }
        System.out.print("[");
        System.out.print(ctx.expresion_aritmetica().getText());
        System.out.print("]");
    }

    // Traduccion del acceso al tamaño de un arreglo de la forma array.size
    @Override
    public void enterArray_size(CoralParser.Array_sizeContext ctx){
        // if(proceed) System.out.print(".length");
    }

    // Traduccion del acceso a una variable comun de la forma id
    @Override
    public void enterStd_variable(CoralParser.Std_variableContext ctx){
        System.out.print("");
    }

    // Traduccion de la entrada de un dato por usuario
    @Override
    public void enterData_capture(CoralParser.Data_captureContext ctx) {
        // Conseguimos el indice de la regla de captura de datos
        String varToScan = ctx.parent.parent.getChild(0).getText();
        // Validamos en el mapa de tipos el tipo de variable para seleccionar la salida de entrada
        if (varTypeMap.get(varToScan).equals("integer")){
            System.out.print(" coralScan.nextInt()");
        }
        else{
            System.out.print(" coralScan.nextDouble()");
        }

    }

    // Traduccion de la asignacion de una variable a un numero
    @Override
    public void enterAsgEntrada(CoralParser.AsgEntradaContext ctx){
        if (!ctx.entrada().getText().equals("Get next input") && !ctx.entrada().getText().equals("Getnextinput")){
            String complement = ctx.complemento_asignacion().getText();
            if(complement.equals(".size")) return;
            if(!complement.isBlank()) proceed = false;
            System.out.print(complement+" "+ctx.ASSIGN()+" ");
            if(!(complement==null)){
                proceed = false;
            }
            String number = ctx.entrada().getText();

            // Si es un entero o un float si se imprime
            try{
                int isNumber = Integer.parseInt(number);
                System.out.print(isNumber);
            }catch (NumberFormatException e){
                try{
                    double isNumber = Double.parseDouble(number);
                    System.out.print(isNumber);
                }catch (NumberFormatException er){
                    // Verificar si es una expresion aritmetica (4+i)/2
                    //System.out.print(number);
                    if(number.indexOf(".size")>=0){
                        System.out.print(number.substring(0,number.indexOf(".size")));
                    }else{
                        System.out.print(number);
                    }
                    go = false;
                    System.out.print("");
                }
            }
        }
        else{
            System.out.print(" "+ctx.ASSIGN());
        }

    }

    @Override
    public void exitAsgEntrada(CoralParser.AsgEntradaContext ctx) {
        if(proceed == go) System.out.println(";");
    }

    // Traduccion salida
    @Override
    public void enterSalida(CoralParser.SalidaContext ctx){
        // Aqui se corrige lo del printf para numeros
        try{
            String isPrecisionOutput = ctx.complemento_salida().getChild(3).getChild(0).getText();
            // Si es una salida de precision se ajusta en otra funcion, sino se imprime la linea normal
        }
        catch (Exception e) {
            System.out.print("System.out.println(");
        }
    }

    // Traduccion de la salida de una cadena de texto STRING
    @Override
    public void enterStringOutput(CoralParser.StringOutputContext ctx){
        System.out.print(ctx.STRING());
    }

    @Override
    public void exitStringOutput(CoralParser.StringOutputContext ctx){
        System.out.println(");");
    }

    // Traduccion del numero de digitos para precisión
    @Override
    public void enterPrecisionOutput(CoralParser.PrecisionOutputContext ctx){
        RuleContext parentCtx = ctx.parent;
        String val = parentCtx.getChild(0).getText();
        System.out.print("System.out.printf(\"%." + ctx.expresion_aritmetica_precision().getText() + "f\", " + val);
    }

    // Traduccion de la salida de numeros o variables
    @Override
    public void enterNumberOutput(CoralParser.NumberOutputContext ctx){
        if (ctx.precision_salida().getChild(0) != null){
            // Do nothing
        } else {
            System.out.print(ctx.expresion_aritmetica().getText());
            if(ctx.expresion_aritmetica().getText().indexOf("[")>=0) go = false;
        }
    }

    @Override
    public void exitNumberOutput(CoralParser.NumberOutputContext ctx){
        System.out.println(");");
    }

    // Final de la salida
    @Override
    public void exitSalida(CoralParser.SalidaContext ctx){
        // System.out.println(");");
    }

    // Traduccion de una condicion booleana para un if
    @Override
    public void enterCond_bool_if(CoralParser.Cond_bool_ifContext ctx){
        System.out.print("(");
        // Vamos a revisar si la condicion booleana del for contiene el atributo size
        String condBoolIf = ctx.cond_bool().getText();
        if (condBoolIf.contains(".size")){
            condBoolIf = condBoolIf.replace(".size", ".length");
        }

        // Ajustamos la traducción de or y and
        if (condBoolIf.contains("or")){
            condBoolIf = condBoolIf.replace("or", " || ");
        }
        else if (condBoolIf.contains("and")){
            condBoolIf = condBoolIf.replace("and", " && ");
        }
        System.out.print(condBoolIf);
        System.out.println(") {");
    }

    // Traduccion del condicional if
    @Override
    public void enterIf(CoralParser.IfContext ctx){
        System.out.print("if");
    }

    @Override
    public void exitIf(CoralParser.IfContext ctx){
        // System.out.println("}");
    }

    // Traduccion de un elseif
    @Override
    public void enterIf_elseif(CoralParser.If_elseifContext ctx){
        System.out.print("}\nelseif ");
    }

    @Override
    public void exitIf_elseif(CoralParser.If_elseifContext ctx){
        System.out.println("}");
    }

    // Traduccion de un else
    @Override
    public void enterFill_else(CoralParser.Fill_elseContext ctx){
        System.out.println("}\nelse {");
    }

    @Override
    public void exitFill_else(CoralParser.Fill_elseContext ctx){
        //System.out.println("}");
    }

    @Override
    public void enterEmpty_else(CoralParser.Empty_elseContext ctx){
        // System.out.println("}");
    }

    // Traduccion del ciclo while
    @Override
    public void enterWhile(CoralParser.WhileContext ctx){
        System.out.print("while");

    }

    @Override
    public void enterContinua_programa_while(CoralParser.Continua_programa_whileContext ctx){
        System.out.println("}");
    }

    // Traduccion del condicional para un ciclo while
    @Override
    public void enterCond_bool_while(CoralParser.Cond_bool_whileContext ctx){
        System.out.print("(");
        // Vamos a revisar si la condicion booleana del for contiene el atributo size
        String condBoolWhile = ctx.cond_bool().getText();
        if (condBoolWhile.contains(".size")){
            condBoolWhile = condBoolWhile.replace(".size", ".length");
            System.out.print(condBoolWhile);
        }
        else{
            System.out.print(ctx.cond_bool().getText());
        }
        System.out.println(") {");
    }

    @Override
    public void exitWhile(CoralParser.WhileContext ctx){
        // Does nothing
    }

    // Traduccion del ciclo for
    @Override
    public void enterFor(CoralParser.ForContext ctx){
        System.out.print("for (");
        // Iniciacion del iterador
        System.out.print(ctx.ID(0));
        System.out.print(ctx.ASSIGN(0));
        System.out.print(ctx.expresion_aritmetica_for(0).getText());
        System.out.print(ctx.SEMICOLON(0));
        // Condicion para el booleano
        // Vamos a revisar si la condicion booleana del for contiene el atributo size
        String condBoolFor = ctx.cond_bool_for().getText();
        if (condBoolFor.contains(".size")){
            condBoolFor = condBoolFor.replace(".size", ".length");
            System.out.print(condBoolFor);
        }
        else{
            System.out.print(ctx.cond_bool_for().getText());
        }

        System.out.print(ctx.SEMICOLON(1));
        // Update del iterador
        System.out.print(ctx.ID(1));
        System.out.print(ctx.ASSIGN(1));
        System.out.print(ctx.expresion_aritmetica_for(1).getText());
        System.out.println(") {");
    }

    @Override
    public void exitExpresion_aritmetica(CoralParser.Expresion_aritmeticaContext ctx) {

        if(ctx.getText().indexOf(".size")>=0)
            System.out.print(ctx.getText().substring(ctx.getText().indexOf(".size")+5));
    }

    @Override
    public void enterExpresion_aritmetica_for(CoralParser.Expresion_aritmetica_forContext ctx){
        // Funcion para override
    }

    @Override
    public void enterCond_bool_for(CoralParser.Cond_bool_forContext ctx){
        // Rule for skipping
    }
    @Override
    public void enterContinua_programa_for(CoralParser.Continua_programa_forContext ctx){
        System.out.println("}");
    }

    @Override
    public void enterContinua_programa_if(CoralParser.Continua_programa_ifContext ctx){
        System.out.println("}");
    }
    @Override
    public void exitFor(CoralParser.ForContext ctx){
        // System.out.println("}");
    }

    // Definicion de un arreglo
    @Override
    public void enterEs_arreglo(CoralParser.Es_arregloContext ctx){
        // Si se tiene el char de array se ejecuta la traducción de otro modo se ignora
        if (ctx.getChild(0) != null){
            char arraySize = ctx.tamano_arreglo().getText().charAt(0);
            if (arraySize == '?'){
                // Se debe definir el arrayList o Array
            }
        }
    }

    // Definicion de una funcion
    @Override
    public void enterFunction(CoralParser.FunctionContext ctx){
        System.out.print("public ");

        // Se define el tipo de retorno para la funcion
        // Revisamos que el retorno no sea null (Nothing)
        String functionReturnType = "";
        boolean isArray = false;
        try{
            functionReturnType = ctx.tipo_retorno().tipo_dato().getText();

        } catch (Exception e){
            functionReturnType = "nothing";
        }

        try{
            if (ctx.tipo_retorno().es_arreglo().getChild(0).getText().contains("array")){
                isArray = true;
            }
        } catch (Exception notArray){
            // Ignore
        }

        switch (functionReturnType) {
            case "nothing":
                System.out.print("void ");
                break;
            case "integer":
                if (isArray){
                    System.out.print("int []");
                }
                else {
                    System.out.print("int ");
                }
                break;
            case "float":
                if (isArray){
                    System.out.print("double[] ");
                }
                else {
                    System.out.print("double ");
                }
                break;
        }
        // Se define el ID de la funcion
        System.out.print(ctx.ID().getText());
        // Se definen los parametros de la funcion
        System.out.print(ctx.OPENING_PAR());
        // System.out.print(ctx.parametros_definicion().getText());
        /*
        System.out.print("public ");
        // Se define el tipo de retorno para la funcion
        // Revisamos que el retorno no sea null (Nothing)
        String functionReturnType = "";
        boolean isArray = false;
        try{
            functionReturnType = ctx.tipo_retorno().tipo_dato().getText();

        } catch (Exception e){
            functionReturnType = "nothing";
        }

        try{
            if (ctx.tipo_retorno().es_arreglo().getChild(0).getText().contains("array")){
                isArray = true;
            }
        } catch (Exception notArray){
            // Ignore
        }

        switch (functionReturnType) {
            case "nothing":
                System.out.print("void ");
                break;
            case "integer":
                if (isArray){
                    System.out.print("int[] ");
                }
                else {
                    System.out.print("int ");
                }
                break;
            case "float":
                if (isArray){
                    System.out.print("double[] ");
                }
                else {
                    System.out.print("double ");
                }
                break;
        }
        // Se define el ID de la funcion
        System.out.print(ctx.ID().getText());
        // Se definen los parametros de la funcion
        System.out.print(ctx.OPENING_PAR());
        // System.out.print(ctx.parametros_definicion().getText());
        */
    }

    @Override
    public void enterMas_funciones_close(CoralParser.Mas_funciones_closeContext ctx){
        ParserRuleContext returnCtx = ctx.getParent();
        String varReturn = returnCtx.children.get(6).getChild(2).getText();
        System.out.println("return "+varReturn+";");
        System.out.println("}");
    }

    @Override
    public void exitFunction(CoralParser.FunctionContext ctx) {
        // Si el retorno no es nothing se añade el return
        String functionReturnType = "";
        try{
            functionReturnType = ctx.tipo_retorno().tipo_dato().getText();
        } catch (Exception e){
            functionReturnType = "nothing";
        }
        if (!functionReturnType.equals("nothing")){
            //System.out.println("return " + ctx.tipo_retorno().ID().getText());
        }
        // System.out.println("}\n");
    }

    // Traduccion de la funcion main
    @Override
    public void enterFuncionMain(CoralParser.FuncionMainContext ctx){
        System.out.println("public void Main(){");
    }



    @Override
    public void exitFuncionMain(CoralParser.FuncionMainContext ctx){
        System.out.println("}");
    }

    // Traduccion de mas funciones
    @Override
    public void enterOtraFuncion(CoralParser.OtraFuncionContext ctx){
        System.out.print("public ");

        // Se define el tipo de retorno para la funcion
        // Revisamos que el retorno no sea null (Nothing)
        String functionReturnType = "";
        try{
            functionReturnType = ctx.tipo_retorno().tipo_dato().getText();
        } catch (Exception e){
            functionReturnType = "nothing";
        }

        switch (functionReturnType) {
            case "nothing":
                System.out.print("void ");
                break;
            case "integer":
                System.out.print("int ");
                break;
            case "float":
                System.out.print("double ");
                break;
        }
        // Se define el ID de la funcion
        System.out.print(ctx.ID().getText());

        // Se definen los parametros de la funcion
        System.out.print(ctx.OPENING_PAR());

    }

    @Override
    public void exitOtraFuncion(CoralParser.OtraFuncionContext ctx){
        System.out.println("}");
    }

    // Parametros de la definicion de una funcion
    @Override
    public void enterParamsDef(CoralParser.ParamsDefContext ctx){
        // Si no hay ningun parametero
        System.out.print(ctx.tipo_dato().getText() + " " + ctx.ID().getText());
    }

    @Override
    public void enterNoParams(CoralParser.NoParamsContext ctx){
        System.out.println(") {");
    }

    @Override
    public void enterMoreParametersDef(CoralParser.MoreParametersDefContext ctx){
        System.out.print(", ");
        System.out.print(ctx.tipo_dato().getText() + " " + ctx.ID().getText());
    }

    @Override
    public void enterNoMoreParametersDef(CoralParser.NoMoreParametersDefContext ctx){
        System.out.println(") {");
    }

    // Built-In Functions
    // SeedRandomNumbers
    @Override
    public void enterSeedrn(CoralParser.SeedrnContext ctx){
        // Se ignora el seed en tanto no es posible colocar un limite inferior
        /*
        String randomSeed = ctx.expresion_aritmetica().getText();
        // Instancia de la clase random
        System.out.println("Random r = new Random();");
        System.out.println("r.setSeed(" + randomSeed + ");");
        */
    }

    // Traduccion de numeros (Incluye Builtins)
    @Override
    public void enterSqRoot(CoralParser.SqRootContext ctx){
        String sqrtNum = ctx.expresion_aritmetica().getText();
        System.out.print("Math.sqrt(" + sqrtNum + ")");
    }

    @Override
    public void enterAbsValue(CoralParser.AbsValueContext ctx){
        String absValNum = ctx.expresion_aritmetica().getText();
        System.out.print("Math.abs(" + absValNum + ")");
    }

    @Override
    public void enterRtp(CoralParser.RtpContext ctx){
        // Esta expresion aritmetica hay que cambiarla. Puede ser un alias
        // La idea es lograr que traduzca antes de cargar al output
        //String a = ctx.expresion_aritmetica(0).getText();
        //String b = ctx.expresion_aritmetica(1).getText();
        System.out.print("Math.pow("  + ","  + ")");
    }

    @Override
    public void exitRtp(CoralParser.RtpContext ctx){
        System.out.print(")");
    }

    @Override
    public void enterRanum(CoralParser.RanumContext ctx){
        String lowerLimit = ctx.expresion_aritmetica_param(0).getText();
        String upperLimit = ctx.expresion_aritmetica_param(1).getText();
        System.out.print("Math.floor(Math.random()*("+upperLimit+"-"+lowerLimit+"+1)+" + lowerLimit);
    }
    @Override
    public void exitRanum(CoralParser.RanumContext ctx){
        System.out.println(")");
    }

    @Override
    public void enterExp_arit(CoralParser.Exp_aritContext ctx){
        try {
            String containsBuiltIn = ctx.expresion_aritmetica().expresion_aritmetica3().expresion_aritmetica5().numero().getChild(0).getText();
            if (containsBuiltIn.equals("SquareRoot") || containsBuiltIn.equals("AbsoluteValue") || containsBuiltIn.equals("RandomNumber") || containsBuiltIn.equals("RaiseToPower")){
                // Does nothing
            }
        }
        catch (Exception noBuiltIn){
            //System.out.println(ctx.expresion_aritmetica().getText());
        }
    }

    @Override
    public void enterId_number(CoralParser.Id_numberContext ctx) {
        if(!(ctx.ID().getText() == null) && !(ctx.complemento_id().getText() == null)){
            // System.out.print(ctx.ID().getText());
        }
        try {
            if (ctx.complemento_id().getText().equals(".size")) {
                // System.out.print(".length");
            }
        } catch (Exception lengthException){
            System.out.println(lengthException);

        }
    }

}

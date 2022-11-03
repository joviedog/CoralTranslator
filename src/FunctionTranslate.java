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
            System.out.print("float ");
            // Añadimos la variable al mapa de tipos
            varTypeMap.put(ctx.ID().getText(), "float");
        }
        // Añadimos el ID y el ; para terminar la traduccion
        System.out.println(ctx.ID().getText() + ";");
    }

    // Traduccion de un identificador para asignacion
    @Override
    public void enterId_asg(CoralParser.Id_asgContext ctx){
        System.out.print(ctx.ID());
    }

    // Traduccion de acceso a un arreglo de la forma id[x]
    @Override
    public void enterArray_access(CoralParser.Array_accessContext ctx){
        System.out.print("[");
        System.out.println(ctx.expresion_aritmetica());
    }

    // Traduccion del acceso al tamaño de un arreglo de la forma array.size
    @Override
    public void enterArray_size(CoralParser.Array_sizeContext ctx){
        System.out.print(".size");
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
            System.out.println(" coralScan.nextInt();");
        }
        else{
            System.out.println(" coralScan.nextFloat()");
        }

    }

    // Traduccion de la asignacion de una variable a un numero
    @Override
    public void enterAsgEntrada(CoralParser.AsgEntradaContext ctx){
        if (!ctx.entrada().getText().equals("Get next input") && !ctx.entrada().getText().equals("Getnextinput")){
            System.out.print(ctx.ASSIGN());
            System.out.print(ctx.entrada().getText());
            System.out.println(";");
        }
        else{
            System.out.print(ctx.ASSIGN());
        }
    }

    // Traduccion salida
    @Override
    public void enterSalida(CoralParser.SalidaContext ctx){
        // Aqui se corrige lo del printf para numeros
        System.out.print("System.out.printf(");
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
        System.out.print("'%,." + ctx.expresion_aritmetica_precision().getText() + "f'");
    }

    // Traduccion de la salida de numeros o variables
    @Override
    public void enterNumberOutput(CoralParser.NumberOutputContext ctx){
        System.out.print(ctx.expresion_aritmetica().getText());
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
        System.out.print(ctx.cond_bool().getText());
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
        System.out.println("}");
    }
    @Override
    public void enterEmpty_else(CoralParser.Empty_elseContext ctx){
        System.out.println("}");
    }
    // Traduccion del ciclo while
    @Override
    public void enterWhile(CoralParser.WhileContext ctx){
        System.out.print("while");
    }
    // Traduccion del condicional para un ciclo while
    @Override
    public void enterCond_bool_while(CoralParser.Cond_bool_whileContext ctx){
        System.out.print("(");
        System.out.print(ctx.cond_bool().getText());
        System.out.println(") {");
    }
    @Override
    public void exitWhile(CoralParser.WhileContext ctx){
        System.out.println("}");
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
        System.out.print(ctx.cond_bool().getText());
        System.out.print(ctx.SEMICOLON(1));
        // Update del iterador
        System.out.print(ctx.ID(1));
        System.out.print(ctx.ASSIGN(1));
        System.out.print(ctx.expresion_aritmetica_for(1).getText());
        System.out.println(") {");
    }
    @Override
    public void enterExpresion_aritmetica_for(CoralParser.Expresion_aritmetica_forContext ctx){
        // Funcion para override
    }

    @Override
    public void enterCond_bool_for(CoralParser.Cond_bool_forContext ctx){
        // xd
    }
    @Override
    public void exitFor(CoralParser.ForContext ctx){
        System.out.println("}");
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
            else{
                // Se asigna el tamaño
                System.out.println("["+arraySize+"]");
            }
        }
    }

    // Definicion de una funcion
    @Override
    public void enterFunction(CoralParser.FunctionContext ctx){
        System.out.print("public ");
        // Se define el tipo de retorno para la funcion
        String functionReturnType = ctx.tipo_retorno().tipo_dato().getText();
        System.out.print(functionReturnType);
        switch (functionReturnType) {
            case "nothing ":
                System.out.print("void ");
                break;
            case "integer ":
                System.out.print("int ");
                break;
            case "float ":
                System.out.println("float ");
                break;
        }
        // Se define el ID de la funcion
        System.out.print(ctx.ID().getText());
        // Se definen los parametros de la funcion
        System.out.print(ctx.OPENING_PAR());
        System.out.print(ctx.parametros_definicion().getText());
        System.out.print(ctx.CLOSING_PAR());
        // Fin de la definicion
        System.out.println("{");
    }
    @Override
    public void exitFunction(CoralParser.FunctionContext ctx){
        System.out.println("}\n");
    }
    // Built-In Functions
    // SeedRandomNumbers
    @Override
    public void enterSeedrn(CoralParser.SeedrnContext ctx){
        // Determinación del seed
        String randomSeed = ctx.expresion_aritmetica().getText();
        // Instancia de la clase random
        System.out.println("Random r = new Random();");
        System.out.println("r.setSeed(" + randomSeed + ");");
    }
    // Traduccion de las otras built in
    @Override
    public void enterSqRoot(CoralParser.SqRootContext ctx){
        String sqrtNum = ctx.expresion_aritmetica().getText();
        System.out.println(sqrtNum);
        System.out.println("Math.sqrt(" + sqrtNum + ");");
    }

    @Override
    public void enterAbsValue(CoralParser.AbsValueContext ctx){
        String absValNum = ctx.expresion_aritmetica().getText();
        System.out.println("Math.abs(" + absValNum + ");");
    }

    @Override
    public void enterRtp(CoralParser.RtpContext ctx){
        String a = ctx.expresion_aritmetica(0).getText();
        String b = ctx.expresion_aritmetica(1).getText();
        System.out.println("Math.pow(" + a + "," + b + ");");
    }

    @Override
    public void enterRanum(CoralParser.RanumContext ctx){
        String lowerLimit = ctx.expresion_aritmetica(0).getText();
        String upperLimit = ctx.expresion_aritmetica(1).getText();
        System.out.print("Math.floor(Math.random()*("+upperLimit+"-"+lowerLimit+"+1)+" + lowerLimit+ ");");
    }


}

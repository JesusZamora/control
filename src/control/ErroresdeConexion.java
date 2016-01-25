/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
/**
 *
 * @author Tottus
 */
public class ErroresdeConexion {

    
    public ErroresdeConexion() {
    }
    
    public static String MessageError(int errorcode,String sqlexception){
        String errornombre="";
        switch(errorcode){
            case 1005 :
                errornombre="No puedo crear tabla";break;
            case 1011 :    
                errornombre="Error en el borrado";break;
            case 1012 :
                errornombre="No puedo leer el registro en la tabla del sistema";break;
            case 1020 :    
                errornombre="El registro ha cambiado desde la ultima lectura de la tabla";break;
            case 1022 :
                errornombre="No puedo escribir, clave duplicada en la tabla";break;
            case 1032 :    
                errornombre="No puedo encontrar el registro";break;
            case 1034 :
                errornombre="Clave de archivo erronea para la tabla";break;
            case 1035 :    
                errornombre="Clave de archivo antigua para la tabla '%s'; reparelo";break;
            case 1040 :
                errornombre="Demasiadas conexiones";break;
            case 1042 :    
                errornombre="No puedo obtener el nombre de maquina de tu direccion";break;
            case 1043 :
                errornombre="Protocolo erroneo ";break;
            case 1046 :    
                errornombre="Base de datos no seleccionada ";break;
            case 1047 :
                errornombre="Comando desconocido";break;
            case 1048 :    
                errornombre="La columna '%s' no puede ser nula";break;
            case 1049 :
                errornombre="Base de datos desconocida";break;
            case 1050 :    
                errornombre="La tabla '%s' ya existe";  break;
            case 1051 :
                errornombre="Tabla '%s' desconocida";break;
            case 1053 :    
                errornombre="Desconexion de servidor en proceso";break;
            case 1056 :
                errornombre="No puedo agrupar";break;
            case 1057 :    
                errornombre="El estamento tiene funciones de suma y columnas en el mismo estamento";break;
            case 1058 :
                errornombre="La columna con count no tiene valores para contar";break;
            case 1060 :    
                errornombre="Nombre de columna duplicado";break;
            case 1061 :
                errornombre="Nombre de clave duplicado";break;
            case 1062 :    
                errornombre=" Entrada duplicada '%s' para la clave";break;
            case 1063 :
                errornombre="Especificador de columna erroneo para la columna '%s'";break;
            case 1065 :    
                errornombre="La query estaba vacia";break;
            case 1068 :
                errornombre="Multiples claves primarias definidas";break;
            case 1069 :    
                errornombre="Demasiadas claves primarias declaradas.";break;
            case 1072 :
                errornombre="La columna clave '%s' no existe en la tabla ";break;
            case 1090 :    
                errornombre="No puede borrar todos los campos con ALTER TABLE. Usa DROP TABLE para hacerlo";break;
            case 1091 :
                errornombre="No puedo ELIMINAR '%s'. compuebe que el campo/clave existe";break;
            case 1104 :    
                errornombre="El SELECT puede examinar muchos registros y probablemente con mucho tiempo. Verifique tu WHERE y usa SET SQL_BIG_SELECTS=1 si el SELECT esta correcto";break;     
            case 1105 :
                errornombre="Error desconocido";break;
            case 1106 :    
                errornombre="Procedimiento desconocido";break;
            case 1107 :
                errornombre=" Equivocado parametro count para procedimiento %s ";break;
            case 1108 :    
                errornombre="Equivocados parametros para procedimiento";break;
            case 1109 :
                errornombre="Tabla desconocida";break;
            case 1111 :    
                errornombre=" Invalido uso de función en grupo";break;
            case 1113 :
                errornombre="Una tabla debe tener al menos 1 columna";break;
            case 1114 :    
                errornombre="La tabla '%s' está llena ";break;
            case 1115 :
                errornombre="Juego de caracteres desconocido:";break;
            case 1116 :    
                errornombre="Muchas tablas. MySQL solamente puede usar %d tablas en un join";break;
            case 1117 :
                errornombre="Muchos campos";break;
            case 1118 :    
                errornombre="Tamaño de línea muy grande. Máximo tamaño de línea, no contando blob, es %ld. Tu tienes que cambiar algunos campos para blob";break;
            case 1120 :
                errornombre="Dependencia cruzada encontrada en OUTER JOIN. Examine su condición ON";break;
            case 1122 :    
                errornombre=" No puedo cargar función";break;
            case 1123 :
                errornombre="No puedo inicializar función ";break;
            case 1124 :    
                errornombre="No pasos permitidos para librarias conjugadas";  break;
            case 1127 :
                errornombre="No puedo encontrar función";break;
            case 1128 :    
                errornombre="Función '%s' no está definida";break;
            case 1129 :
                errornombre="Servidor '%s' está bloqueado por muchos errores de conexión. Desbloquear con 'mysqladmin flush-hosts'";break;
            case 1131 :    
                errornombre="Tu estás usando MySQL como un usuario anonimo y usuarios anonimos no tienen permiso para cambiar las claves";break;
            case 1132 :
                errornombre="Tu debes de tener permiso para actualizar tablas en la base de datos mysql para cambiar las claves para otros";break;
            case 1133 :    
                errornombre="No puedo encontrar una línea correspondiente en la tabla user ";break;
            case 1135 :
                errornombre="No puedo crear un nuevo thread (errno %d). Si tu está con falta de memoria disponible, tu puedes consultar el Manual para posibles problemas con SO";break;
            case 1138 :    
                errornombre=" Invalido uso de valor NULL ";break;
            case 1140 :
                errornombre="Mezcla de columnas GROUP (MIN(),MAX(),COUNT()...) con no GROUP columnas es ilegal si no hay la clausula GROUP BY ";break;
            case 1141 :    
                errornombre="No existe permiso definido para usuario";break;
            case 1144 :
                errornombre="Ilegal comando GRANT/REVOKE. Por favor consulte el manual para cuales permisos pueden ser usados.";break;
            case 1145 :    
                errornombre="El argumento para servidor o usuario para GRANT es demasiado grande";break;
            case 1146 :
                errornombre="Tabla '%s.%s' no existe";break;
            case 1148 :    
                errornombre="El comando usado no es permitido con esta versión de MySQL";break;
            case 1149 :
                errornombre=" Algo está equivocado en su sintax ";  break;
            case 1157 :    
                errornombre="No puedo descomprimir paquetes de comunicación";break;
            case 1158 :
                errornombre="Obtenido un error leyendo paquetes de comunicación";break;
            case 1159 :    
                errornombre="Obtenido timeout leyendo paquetes de comunicación ";break;
            case 1160 :
                errornombre="Obtenido un error de escribiendo paquetes de comunicación";break;
            case 1161 :    
                errornombre="Obtenido timeout escribiendo paquetes de comunicación";  break;
            case 1163 :
                errornombre="El tipo de tabla usada no permite soporte para columnas BLOB/TEXT ";break;
            case 1164 :    
                errornombre="El tipo de tabla usada no permite soporte para columnas AUTO_INCREMENT";break;
            case 1166 :
                errornombre="Incorrecto nombre de columna";break;
            case 1167 :    
                errornombre="El manipulador de tabla usado no puede indexar columna";break;
            case 1169 :
                errornombre="No puedo escribir, debido al único constraint, para tabla";break;
            case 1171 :    
                errornombre="Todas las partes de un PRIMARY KEY deben ser NOT NULL; Si necesitas NULL en una clave, use UNIQUE ";break;
            case 1172 :
                errornombre="Resultado compuesto de mas que una línea ";break;
            case 1173 :    
                errornombre="Este tipo de tabla necesita de una primary key";break;
            case 1175 :
                errornombre="Tu estás usando modo de actualización segura intentado actualizar una tabla sin un WHERE que usa una KEY columna";break;
            case 1177 :    
                errornombre="No puedo abrir tabla";break;
            case 1180 :
                errornombre="Obtenido error %d durante COMMIT";break;
            case 1181 :    
                errornombre="Obtenido error %d durante ROLLBACK";break;
            case 1182 :
                errornombre="Obtenido error %d durante FLUSH_LOGS";break;
            case 1183 :    
                errornombre="Obtenido error %d durante CHECKPOINT";break;
            case 1191 :
                errornombre="No puedo encontrar índice FULLTEXT correspondiendo a la lista de columnas";break;
            case 1204 :
                errornombre="Tu solo debes usar expresiones constantes con SET";break;
            case 1205 :    
                errornombre="Tiempo de bloqueo de espera excedido";break;
            case 1206 :
                errornombre="El número total de bloqueos excede el tamaño de bloqueo de la tabla ";break;
            case 1210 :    
                errornombre="Argumentos errados";break;
            case 1214 :
                errornombre="El tipo de tabla usada no soporta índices FULLTEXT";  break;
            case 1215 :    
                errornombre="No puede adicionar clave extranjera constraint";break;
            case 1222 :
                errornombre="El comando SELECT usado tiene diferente número de columnas";break;
            case 1223 :    
                errornombre="No puedo ejecutar el query porque usted tiene conflicto de traba de lectura";break;
            case 1232 :
                errornombre="Tipo de argumento equivocado para variable";break;
            case 1235 :    
                errornombre="Esta versión de MySQL no soporta todavia";  break;
            case 1240 :
                errornombre="Referencia de llave y referencia de tabla no coinciden";break;
            case 1242 :    
                errornombre="Subconsulta retorna mas que 1 línea";break;
            case 1245 :
                errornombre="Cíclica referencia en subconsultas";break;
            case 1248 :    
                errornombre="Cada tabla derivada debe tener su propio alias";break;
            case 1251 :
                errornombre="Cliente no soporta protocolo de autenticación solicitado por el servidor; considere actualizar el cliente MySQL";break;
            case 1317 :    
                errornombre="Consulta En Execucion Fue Interrumpida";break;
            case 1359 :
                errornombre="El Trigger Ya Existe";break;
            case 1360 :    
                errornombre="El Trigger No Existe";break;
            case 2000 :
                errornombre=" El error desconocido MySQL";break;
            case 2002 :    
                errornombre="No puede conectarse al servidor local MySQL a través de conector ";break;
            case 2003 :
                errornombre="No puede conectarse al servidor MySQL en ";break;
            case 2008 :    
                errornombre="El cliente MySQL se quedó sin memoria";break;
            case 2050 :
                errornombre=" La fila que la recuperación fue cancelada por la llamada _ cercana mysql stmt ()";break;
            case 2052 :    
                errornombre="La declaración preparada no contiene metadatos";break;
            default :
                    errornombre=sqlexception; break;
        }
        
        return errornombre;
    }
    
}

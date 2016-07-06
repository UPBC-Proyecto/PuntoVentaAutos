package com.example.eduardo.myapplication.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by eduardo on 6/28/16.
 */
public class ManejadorBD extends SQLiteOpenHelper {

    //VARIABLES ESTATICAS
    //VERSION DE LA BASE DE DATOS
    private static final int VERSION_BD = 1;
    //NOMBRE DE LA BASE DE DATOS
    private static final String NOMBRE_BD = "Autos";
    //////////////////////////////////////////////////////////////////

    //NOMBRE DE LA TABLA EMPLEADO
    private static final String TABLA_EMPLEADO = "empleado";
    //NOMBRE DE LAS COLUMNAS DE TABLA EMPLEADO
    private static final String ID_EMPLEADO = "id_empleado";
    private static final String NOMBRE_EMPLEADO = "nombre";
    private static final String APATERNO_EMPLEADO = "apaterno";
    private static final String AMATERNO_EMPLEADO = "amterno";
    private static final String SEXO_EMPLEADO = "sexo";
    private static final String FECHA_NAC_EMPLEADO = "fecha_nac";
    private static final String DIRECCION_EMPLEADO = "direccion";
    private static final String FOTO_EMPLEADO = "foto";
    private static final String ESTATUS_EMPLEADO = "estatus";
    private static final String ROL_EMPLEADO = "rol";

    //CREACION DE LA TABLA EMPLEADOS
    public static final String TABLA_EMPLEADOS_SQL =
            "CREATE TABLE  " + TABLA_EMPLEADO + "(" +
                    ID_EMPLEADO + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    NOMBRE_EMPLEADO + " TEXT NOT NULL," +
                    APATERNO_EMPLEADO + " TEXT NOT NULL," +
                    AMATERNO_EMPLEADO + " TEXT NOT NULL," +
                    SEXO_EMPLEADO + " TEXT," +
                    FECHA_NAC_EMPLEADO + " TEXT," +
                    DIRECCION_EMPLEADO + " TEXT," +
                    FOTO_EMPLEADO + " TEXT," +
                    ESTATUS_EMPLEADO + " TEXT," +
                    ROL_EMPLEADO   + " TEXT);" ;

    //NOMBRE DE LA TABLA ROL
    private static final String TABLA_ROL = "rol";
    //NOMBRE DE LA COLUMNAS DE ROL
    private static final String ID_ROL = "id_rol";
    private static final String DESCRIPCION = "descripcion";
    private static final String ESTATUS_ROL = "estatus";

    //CREACION DE LA TABLA ROL
    public static final String TABLA_ROL_SQL =
            "CREATE TABLE " + TABLA_ROL + "(" +
                    ID_ROL + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    DESCRIPCION + " TEXT NOT NULL," +
                    ESTATUS_ROL + " TEXT NOT NULL);";

    //NOMBRE DE LA TABLA SEXO
    private static final String TABLA_SEXO = "sexo";
    //NOMBRE DE LAS COLUMNAS DE SEXO
    private static final String ID_SEXO = "id_sexo";
    private static final String DESCRIPCION_SEXO = "descripcion";
    private static final String ESTATUS_SEXO = "estatus";

    //CREACION DE LA TABLA SEXO
    public static final String TABLA_SEXO_SQL =
            "CREATE TABLE " + TABLA_SEXO + "(" +
                    ID_SEXO + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    DESCRIPCION_SEXO + " TEXT NOT NULL," +
                    ESTATUS_SEXO + " TEXT NOT NULL);";

    //NOMBRE DE LA TABLA CLIENTE
    private static final String TABLA_CLIENTE = "cliente";
    //NOMBRE DE LAS COLUMNAS DE CLIENTE
    private static final String ID_CLIENTE = "id_cliente";
    private static final String NOMBRE_CLIENTE = "nombre";
    private static final String APATERNO_CLIENTE = "apaterno";
    private static final String AMATERNO_CLIENTE = "amaterno";
    private static final String SEXO_CLIENTE = "sexo";
    private static final String FECHA_NAC_CLIENTE = "fecha_nac";
    private static final String DIRECCION_CLIENTE = "direccion";
    private static final String FOTO_CLIENTE = "foto";
    private static final String ESTATUS_CLIENTE = "estatus";
    private static final String ROL_CLIENTE = "rol";
    private static final String CORREO = "correo";
    private static final String TELEFONO = "telefono";
    private static final String NUM_SEGURO = "num_seguro";

    //CREACION DE LA TABLA CLIENTE
    public static final String TABLA_CLIENTE_SQL =
            "CREATE TABLE " + TABLA_CLIENTE + "(" +
                    ID_CLIENTE + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    NOMBRE_CLIENTE + " TEXT NOT NULL," +
                    APATERNO_CLIENTE + " TEXT NOT NULL," +
                    AMATERNO_CLIENTE + " TEXT NOT NULL," +
                    SEXO_CLIENTE + " TEXT NOT NULL," +
                    FECHA_NAC_CLIENTE + " TEXT NOT NULL," +
                    DIRECCION_CLIENTE + " TEXT NOT NULL," +
                    FOTO_CLIENTE + " TEXT NOT NULL," +
                    ESTATUS_CLIENTE + " TEXT NOT NULL," +
                    ROL_CLIENTE + " TEXT NOT NULL," +
                    CORREO + " TEXT NOT NULL," +
                    TELEFONO + " TEXT NOT NULL," +
                    NUM_SEGURO + " TEXT NOT NULL)";

    //NOMBRE DE LA TABLA VEHICULO
    private static final String TABLA_VEHICULO = "vehiculo";
    //NOMBRE DE LAS COLUMNAS DE VEHICULO
    private static final String ID_VEHICULO = "id_vehiculo";
    private static final String MODELO = "modelo";
    private static final String YEAR = "year";
    private static final String ESTATUS_VEHICULO = "estatus";

    //CREACION DE LA TABLA VEHICULO
    public static final String TABLA_VEHICULO_SQL =
            "CREATE TABLE " + TABLA_VEHICULO + "(" +
                    ID_VEHICULO + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    MODELO + " TEXT NOT NULL," +
                    YEAR + " TEXT NOT NULL," +
                    ESTATUS_VEHICULO + " TEXT NOT NULL)";

    //NOMBRE DE LA TABLA MARCA
    private static final String TABLA_MARCA = "marca";
    //NOMBRE DE LA COLUMNAS DE MARCA
    private static final String ID_MARCA = "id_marca";
    private static final String DESCRIPCION_MARCA = "descripcion";
    private static final String ESTATUS_MARCA = "estatus";

    //CREACION DE LA TABLA MARCA
    public static final String TABLA_MARCA_SQL =
            "CREATE TABLE " + TABLA_MARCA + "(" +
                    ID_MARCA + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    DESCRIPCION_MARCA + " TEXT NOT NULL," +
                    ESTATUS_MARCA + " TEXT NOT NULL)";

    //NOMBRE DE LA TABLA MODELO
    private static final String TABLA_MODELO = "modelo";
    //NOMBRE DE LAS COLUMNAS DE TABLA MODELO
    private static final String ID_MODELO = "id_modelo";
    private static final String DESCRIPCION_MODELO = "descripcion";
    private static final String ESTATUS_MODELO = "estatus";
    private static final String ID_MARCA_F = "id_marca";

    //CREACION DE LA TABLA MODELO
    public static final String TABLA_MODELO_SQL =
            "CREATE TABLE " + TABLA_MODELO + "(" +
                    ID_MODELO + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    DESCRIPCION_MODELO + " TEXT NOT NULL," +
                    ESTATUS_MODELO + " TEXT NOT NULL," +
                    ID_MARCA_F + " TEXT NOT NULL)";

    //NOMBRE DE LA TABLA COLOR
    private static final String TABLA_COLOR = "color";
    //NOMBRE DE LAS COLUMNAS DE COLOR
    private static final String ID_COLOR = "id_color";
    private static final String DESCRIPCION_COLOR = "descripcion";
    private static final String ESTATUS_COLOR = "estatus_color";

    //CREACION DE LA TABLA COLOR
    public static final String TABLA_COLOR_SQL =
            "CREATE TABLE " + TABLA_COLOR + "(" +
                    ID_COLOR + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    DESCRIPCION_COLOR + " TEXT NOT NULL," +
                    ESTATUS_COLOR + " TEXT NOT NULL)";

    //NOMBRE DE LA TABLA TRANSMISION
    private static final String TABLA_TRANSMISION = "transmision";
    //NOMBRE DE COLUMNAS DE TRANSMISION
    private static final String ID_TRANSMISION = "id_transmision";
    private static final String DESCRIPCION_TRANSMISION = "descripcion";
    private static final String ESTATUS_TRANSMISION = "estatus";

    //CREACION DE LA TABLA TRANSMISION
    public static final String TABLA_TRANSMISION_SQL =
            "CREATE TABLE " + TABLA_TRANSMISION + "(" +
                    ID_TRANSMISION + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    DESCRIPCION_TRANSMISION + " TEXT NOT NULL," +
                    ESTATUS_TRANSMISION + " TEXT NOT NULL)";

    //NOMBRE DE LA TABLA MOTOR
    private static final String TABLA_MOTOR = "motor";
    //NOMBRE DE LAS COLUMNAS DE MOTOR
    private static final String ID_MOTOR = "id_motor";
    private static final String DESCRIPCION_MOTOR = "tabla_marca";
    private static final String ESTATUS_MOTOR = "estatus";

    //CREACION DE LA TABLA MOTOR
    public static final String TABLA_MOTOR_SQL =
            "CREATE TABLE " + TABLA_MOTOR + "(" +
                    ID_MOTOR + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    DESCRIPCION_MOTOR + " TEXT NOT NULL," +
                    ESTATUS_MOTOR + " TEXT NOT NULL)";

    //NOMBRE DE LA TABLA CLASIFICACION
    private static final String TABLA_CLASIFICACION = "clasificacion";
    //NOMBRE DE LAS COLUMNAS DE CLASIFICACION
    private static final String ID_CLASIFICACION = "id_clasificacion";
    private static final String DESCRIPCION_CLASIFICACION = "descripcion";
    private static final String ESTATUS_CLASIFICACION = "estatus";

    //NOMBRE DE LA TABLA N.PUERTAS
    private static final String NO_PUERTAS = "no_puertas";
    //NOMBRE DE LAS COLUMNAS DE N.PUERTAS
    private static final String ID_PUERTAS = "id_puertas";
    private static final String DESCRIPCION_PUERTAS = "descripcion";
    private static final String ESTATUS_PUERTAS = "estatus";

    //NOMBRE DE LA TABLA GARANTIAS
    private static final String TABLA_GARANTIAS = "garantias";
    //NOMBRE DE LAS COLUMNAS DE GARANTIAS
    private static final String ID_GARANTIA = "id_garantia";
    private static final String FECHA_INICIO = "fecha_inicio";
    private static final String TIPO_GARANTIA = "tipogarantia";
    private static final String DESCRIPCION_GARANTIA = "descripcion";
    private static final String ID_VEHICULO_F = "id_vehiculo";
    private static final String ID_CLIENTE_F = "id_cliente";
    private static final String ID_EMPLEADO_F = "id_empleado";
    private static final String ESTATUS_GARANTIAS = "estatus";
    private static final String FECHA_EXPIRACION = "fecha_expiracion";
    private static final String ODOMETRO_F = "odometro";

    //NOMBRE DE TABLA TIPOGARANTIA
    private static final String TABLA_TIPOGARANTIA = "tipo_garantia";
    //NOMBRE DE LAS COLUMNAS DE TIPOGARANTIA
    private static final String ID_TIPOGARANTIA = "id_tipogarantia";
    private static final String DESCRIPCION_TIPOGARANTIA = "descripcion";
    private static final String COSTO = "costo";
    private static final String COBERTURA = "cobertura";
    private static final String ESTATUS_TIPOGARANTIA = "estatus";
    private static final String FECHA_EXPIRACION_TG = "fecha_expiracion";
    private static final String ODOMETRO_TG = "odometro";

    //NOMBRE DE LA TABLA SUCURSAL
    private static final String TABLA_SUCURSAL = "sucursal";
    //NOMBRE DE LAS COLUMNAS DE SUCURSAL
    private static final String ID_SUCURSAL = "id_sucursal";
    private static final String NOMBRE_SUCURSAL = "nombre";
    private static final String ESTATUS_SUCURSAL = "estatus";
    private static final String DIRECCION_SUCURSAL = "direccion";

    //NOMBRE DE LA TABLA ALMACEN
    private static final String TABLA_ALMACEN = "almacen";
    //NOMBRE DE LAS COLUMNAS DE ALMACEN
    private static final String ID_ALMACEN = "id_almacen";
    private static final String ID_EMPLEADO_AL = "id_empleado";
    private static final String ID_SUCURSAL_AL = "id_sucursal";
    private static final String NOMBRE_ALMACEN = "nombre";
    private static final String ESTATUS_ALMACEN = "estatus";
    private static final String CAPACIDAD = "capacidad";


    //NOMBRE DE LA TABLA ALMACENDETALLE
    private static final String TABLA_ALMACENDETALLE = "almacen_detalle";
    //NOMBRE DE LAS COLUMNAS ALMACENDETALLE
    private static final String ID_ALMACENDETALLE = "id_almacen";
    private static final String ID_VEHICULO_AL = "id_vehiculo";
    private static final String ESTATUS_ALMACENDETALLE = "estatus";
    private static final String ID_TRANSMISION_F = "id_transmision";
    private static final String ID_MOTOR_F = "id_motor";
    private static final String ID_CLASIFICACION_AL = "id_clasificacion";
    private static final String VIN = "vin";
    private static final String ODOMETRO = "odometro";
    private static final String ID_PUERTAS_F = "id_puertas";
    private static final String ID_CILINDROS = "id_cilindros";

    //NOMBRE DE LA TABLA ALMACENCONFIGURACION
    private static final String TABLA_ALMACENCONFIGURACION = "almacenconfiguracion";
    //NOMBRE DE LAS COLUMNAS DE ALMACENCONFIGURACION
    private static final String ID_ALMACENCONF = "id_almacen";
    private static final String ID_VEHICULOF = "id_vehiculo";
    private static final String MAXIMO = "maximo";
    private static final String MINIMO = "minimo";
    private static final String CANTIDAD_F = "id_almacen";

    //NOMBRE DE LA TABLA VENTA
    private static final String TABLA_VENTA = "venta";
    //NOMBRE DE LAS COLUMNAS DE VENTA
    private static final String ID_VENTA = "id_venta";
    private static final String ID_EMPLEADO_V = "id_empleado";
    private static final String ID_CLIENTE_V = "id_cliente";
    private static final String ID_VEHICULO_V = "id_vehiculo";
    private static final String ID_GARANTIA_V = "id_garantia";
    private static final String ID_SUCURSAL_V = "id_sucursal";
    private static final String FECHAVENTA_V = "fecha_venta";
    private static final String TOTAL = "total";



    

    public ManejadorBD(Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

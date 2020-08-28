package view;

import java.awt.Color;
import java.awt.Font;

public class ConstantView {
	public static final String APP_TITLE = "Empresa de energía";
	public static final String TXT_PERCENTAGE = "Porcentajes";
	public static final String TXT_AVERAGE = "Promedios";
	public static final String TXT_FILE = "Archivos";
	public static final String TXT_AVERAGE_USERS = "Promedio de facturación por usuario";
	public static final String TXT_PERCENTAGE_USE = "porcentajes de tipo de uso";
	
	//Imagenes
	public static final String ICON_APP = "/img/icono.png";
	public static final String FOLDER_PATH_IN = "resources/in/";
	public static final String IMG_STADISTICS1= "/img/stadistics1.png";
	public static final String IMG_STADISTICS2= "/img/stadistics2.png";
	public static final String IMG_MONEY = "/img/money.png";
	public static final String IMG_REFRESH = "/img/refresh.png";
	public static final String IMG_FILE= "/img/file.png";
	public static final String IMG_CALCULATOR= "/img/calculator.png";
	
	public static final String FOLDER_PATH_OUT = "resources/out/ElectricPower.out";
	
	//Tipos de fuentes
	public static final Font FONT_FRAME = new Font("Berlin Sans FB", Font.PLAIN, 18);
	public static final Font FONT_ROCWELL = new Font("Rockwell",Font.PLAIN, 20);
	public static final Font FONT_NEW_ROMAN_13 = new Font("Times New Roman",Font.PLAIN, 13);
	public static final Font FONT_NEW_ROMAN_25 = new Font("Times New Roman",Font.PLAIN, 25);
	public static final Font FONT_COMPONENTS_DIALOG_COST = new Font("Bodoni MT", Font.PLAIN, 15);
	public static final Font FONT_ARIAL_ROUNDER_17 = new Font("Arial Rounded MT Bold", Font.PLAIN, 17);
	public static final Font FONT_ARIAL_ROUNDER_15 = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
	
	public static final float NINETY_PERCENTAGE = 0.9f;
	
	//headers table
	public static final String H_NAME = "Nombre";
	public static final String H_ID = "ID";
	public static final String H_STRATUM = "Estrato";
	public static final String H_N_INHABITANTS = "Nº Habs";
	public static final String H_TYPE_USE = "Tipo de Uso";
	public static final String H_PREVIOUS_READING = "Lectura Ant.";
	public static final String H_CURRENT_READING = "Lectura Act.";
	public static final String H_CONSUMPTION = "Consumo";
	public static final String H_GROSS_TURNOVER = "Vr. Bruto";
	public static final String H_SUBSIDY = "Subsidio";
	public static final String H_TAX = "Impuesto";
	public static final String H_SURCHARGE = "Recargo";
	public static final String H_NET_TURNOVER = "Vr. neto";
	public static final String[] HEADERS = {H_NAME,H_ID,H_STRATUM,H_N_INHABITANTS,H_TYPE_USE,
											H_PREVIOUS_READING,H_CURRENT_READING,H_CONSUMPTION,
											H_GROSS_TURNOVER,H_SUBSIDY,H_TAX,H_SURCHARGE,H_NET_TURNOVER};
	
	public static final String[] USER_ENERGY = {"Uso domestico","Uso Comercial"};
	public static final String[] TYPE_STRATUM = {"Estrato 1","Estrato 2","Estrato 3","Estrato 4","Estrato 5"};
	
	//colores
	public static final Color YELLOW_LIGHT = Color.decode("#FAF438");
	public static final Color COLOR_DARK_BLUE = Color.decode("#304A4B");
	public static final Color COLOR_OF_HEADER_TABLE = Color.decode("#144073");
	public static final Color WHITE = Color.decode("#ffffff");
	public static final Color BLACK = Color.decode("#000000");
}

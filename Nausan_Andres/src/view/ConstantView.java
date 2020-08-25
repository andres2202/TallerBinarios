package view;

import java.awt.Font;

public class ConstantView {
	public static final String APP_TITLE = "Empresa de energía";
	public static final String ICON_APP = "/img/icono.png";
	public static final String FOLDER_PATH_IN = "resources/in/";
	public static final String FOLDER_PATH_OUT = "resources/out/ElectricPower.out";
	public static final Font FONT_FRAME = new Font("Berlin Sans FB", Font.PLAIN, 18);
	
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
}

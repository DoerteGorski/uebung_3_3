package uebung_3_3;

public class uebung_3_3 {

	public static void main(String[] args) {
		
		
		double Alter = 65;
		double GewichtInKilogramm = 86.5;
		double KoerpergroeﬂeInMeter = 1.70;
		boolean GeschlechtMaennlich = true; 
		
		double QuadratDerKoerpergroeﬂe = KoerpergroeﬂeInMeter * KoerpergroeﬂeInMeter;

		double BMI = GewichtInKilogramm / QuadratDerKoerpergroeﬂe;
		
		//Programmierung
		
		if (GeschlechtMaennlich == true)
			{ 
			if (Alter <= 24) 	{ if (BMI <= 20)	{System.out.println("Untergewicht");}
			else 				{ if (BMI >= 25)	{System.out.println("‹bergewicht");}
			else 								{System.out.println("Normalgewicht");}
			} 
			}
			else {if (Alter <= 34) 	{ if (BMI <= 21)	{System.out.println("Untergewicht");}
			else 					{ if (BMI >= 26)	{System.out.println("‹bergewicht");}
			else 									{System.out.println("Normalgewicht");}
			} 
			}
			
			else {if (Alter <= 44) 	{ if (BMI <= 22)	{System.out.println("Untergewicht");}
			else 					{ if (BMI >= 27)	{System.out.println("‹bergewicht");}
			else 									{System.out.println("Normalgewicht");}
			} 
			}
			else {if (Alter <= 54) 	{ if (BMI <= 23)	{System.out.println("Untergewicht");}
			else 					{ if (BMI >= 28)	{System.out.println("‹bergewicht");}
			else 									{System.out.println("Normalgewicht");}
			} 
			}
			else {if (Alter <= 64) 	{ if (BMI <= 24)	{System.out.println("Untergewicht");}
			else 					{ if (BMI >= 29)	{System.out.println("‹bergewicht");}
			else 									{System.out.println("Normalgewicht");}
			} 
			}
			else {if (Alter > 64) 	{ if (BMI <= 25)	{System.out.println("Untergewicht");}
			else 					{ if (BMI >= 30)	{System.out.println("‹bergewicht");}
			else 									{System.out.println("Normalgewicht");}
			} 
			}
			}
			}
			}
			}
			}
			
			}
			
		
		
		
		
		
		System.out.println("BMI = " + BMI);
	}

}

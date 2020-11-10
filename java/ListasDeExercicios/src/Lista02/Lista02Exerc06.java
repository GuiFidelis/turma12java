package Lista02;

import java.util.Scanner;

public class Lista02Exerc06 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;

        System.out.print("Informe a sua idade:  ") ;                       
        idade = leia.nextInt(); 
           	

        if (idade<=4)
        {
        	System.out.print("Desculpe, não oferecemos aulas para pessoas menores de 4 anos");
        }
              
        else if(idade>=5 && idade<=7)
        {
        	System.out.print("Olá! Pela sua idade você se encaixa no perfil: Infantil A ");
        }
        
        else if(idade>=8 && idade<=11)
        {
        	System.out.print("Olá! Pela sua idade você se encaixa no perfil: Infantil B ");
        }
        
        else if(idade>=12 && idade<=13)
        {
        	System.out.print("Olá! Pela sua idade voce se encaixa no perfil: juvenil A ");                            
        }
        
        else if(idade>=14 && idade<=17)
        {
        	System.out.print("Olá! Pela sua idade voce se encaixa no perfil: juvenil B ");                            
        }
        else if(idade>=18)
        {
        	System.out.print("Olá! Pela sua idade voce se encaixa no perfil: Adulto ");                            
        }
	
	}

}

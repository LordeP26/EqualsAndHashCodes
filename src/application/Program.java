package application;

import entities.Client;

/* são operações da classe Object utilizadas para comparar se um objeto é igual ao outro
 * 
 * eqauals: lento, reposta 100%
 * hashCode: rápido, porém resposta positiva não é 100% (retorna um int representando um código gerado a partir das infos do objeto)
 * se dois hashCodes de dois obj for != logo os dois obj são !=
 * 
 * tipos comuns ja possuem implementação mas classes personalizadas precisam sobrepô-las
 */

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Maria", "mariaLira@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(s1 == s2);
	}

}

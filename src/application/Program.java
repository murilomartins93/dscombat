package application;

import java.util.Scanner;
import entities.Champion;

public class Program {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		Champion fighter1 = new Champion(name, life, attack, armor);
		
		System.out.println("\nDigite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		Champion fighter2 = new Champion(name, life, attack, armor);
		
		System.out.print("\nQuantos turnos você deseja executar? ");
		int n = sc.nextInt();
					
		int i = 1;
		do {
			fighter1.takeDamage(fighter2);
			fighter2.takeDamage(fighter1);
			System.out.printf("%nResultado do turno %d:%n", i);
			System.out.println(fighter1.status());
			System.out.println(fighter2.status());
			i++;
		}
		while (fighter1.getLife() > 0 && fighter2.getLife() > 0 && i <= n);
				
		System.out.println("\nFIM DO COMBATE");
		
		sc.close();
	}
}

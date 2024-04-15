package Tp2;

public class Ejecutable {
	public static void main(String[] args) {
		Tree l1 = new Tree();
		l1.add(4);
		l1.add(3);
		l1.add(2);
		l1.add(8);
		l1.add(10);
		l1.add(6);
		l1.add(12);

		System.out.println("arbol binario : ");

		l1.getR().printInOrder(l1.getR());
		System.out.println();

		System.out.println(" la raiz es " + l1.getRoot());

		System.out.println("Este valor existe en el arbol? : " + l1.getR().hasElem(7));
	}
}

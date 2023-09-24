import model.forest.Forest;

import java.awt.*;

public class Main {
	public static final int CANVAS_SIZE = 500;
	public static final int TREES_TO_DRAW = 1000000;
	public static final int TREE_TYPES = 2;

	public static final int NUMBER_OF_TREES_BY_TYPE = TREES_TO_DRAW / TREE_TYPES;

	public static void main(String[] args) {
		Forest forest = new Forest();
		for (int i = 0; i < Math.floor(NUMBER_OF_TREES_BY_TYPE); i++) {
			forest.plantTree(random(), random(),
					"Summer Oak", Color.GREEN, "Oak texture stub");
			forest.plantTree(random(), random(),
					"Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
		}
		forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
		forest.setVisible(true);

		System.out.println(TREES_TO_DRAW + " trees drawn");
		System.out.println("---------------------");
		System.out.println("Memory usage:");
		System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
		System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
		System.out.println("---------------------");
		System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
				"MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
	}

	private static int random() {
		return (int) (Math.random() * ((Main.CANVAS_SIZE) + 1));
	}
}
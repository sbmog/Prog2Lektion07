package opgave05.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Gui extends Application {
    GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.ANTIQUEWHITE);

        final Canvas canvas = new Canvas(400, 400);
        gc = canvas.getGraphicsContext2D();

        root.getChildren().add(canvas);
        drawTree(200, 380, 100, -90, 8);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawTree(double x, double y, double length, double angle, double thickness) {
        if (length < 5) {
            drawLeaf(x, y);
            return;
        }
        gc.setLineWidth(thickness);
        gc.setStroke(Color.SADDLEBROWN);

        double x1 = x + Math.cos(Math.toRadians(angle)) * length;
        double y1 = y + Math.sin(Math.toRadians(angle)) * length;

        gc.strokeLine(x, y, x1, y1);

        drawTree(x1, y1, length * 0.75, angle - 20, thickness * 0.75);
        drawTree(x1, y1, length * 0.75, angle + 20, thickness * 0.75);
    }

    private void drawLeaf(double x, double y) {
        gc.setFill(Color.GREEN);
        gc.fillOval(x - 3, y - 3, 6, 6);
    }
}

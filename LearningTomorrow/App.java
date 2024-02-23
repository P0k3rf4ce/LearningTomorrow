import LearningTomorrowViewer.courseContentPanes.VideoPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Stage primaryStage = new Stage();
        // Create a Pane
        Pane myPane = new Pane();
        // pane size edit
        myPane.setPrefWidth(400);
        myPane.setPrefHeight(300);
        // pane size edit
        VideoPane video = new VideoPane(myPane);
        video.loadContent("LearningTomorrow" + File.separator + "LearningTomorrowViewer" + File.separator + "courseContentPanes" + File.separator + "TEST_FILES" + File.separator + "park.mp4");
        // You can add other nodes/components to your Pane here
        
        ScrollPane scrollPane = new ScrollPane(myPane);

        // Create a Scene with the Pane
        Scene scene = new Scene(scrollPane, 640, 360);

        // Set the Scene on the Stage
        primaryStage.setScene(scene);

        // Set the title of the Stage
        primaryStage.setTitle("Video Player");

        // Show the Stage
        primaryStage.show();
    }
}

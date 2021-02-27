package cartoon;

import javafx.scene.layout.BorderPane;

public class PaneOrganizer {
    private BorderPane _root;

	public PaneOrganizer() {
            //instantiate the BorderPane and call the private methods here
            _root = new BorderPane();
            _root.setStyle("-fx-background-color: #0000ff;");
        }

        // make public getRoot() method that returns the BorderPane
        public BorderPane getRoot(){
	    return _root;
        }

    }


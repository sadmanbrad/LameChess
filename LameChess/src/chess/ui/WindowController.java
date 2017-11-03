/**
 * Created by Bardia
 * on 10/10/2017.
 */

package chess.ui;

import java.awt.*;

public class WindowController {

    private Window model;
    private WindowView view;

    public WindowController() {
        model = new Window();
        view = new WindowView();
    }

    public WindowController(Window model) {
        this.model = model;
        view = new WindowView();
    }

    public WindowController(Window model, WindowView view) {
        this.model = model;
        this.view = view;
    }

    public void setSize(int width, int height) {
        model.setWidth(width);
        model.setHeight(height);
        view.setSize(width, height);
    }

    public Dimension getSize() {
        return new Dimension(model.getWidth(), model.getHeight());
    }

    public void showWindow() {
        view.show();
    }

    public void hideWindow() {
        view.hide();
    }

    public void updateView() {
        view.repaint();
    }

}

/**
 * Created by Bardia
 * on 10/10/2017.
 */

package chess.ui;

import javax.swing.*;

public class WindowView {

    private JFrame windowFrame;

    public WindowView() {
        windowFrame = new JFrame();
    }

    public void hide() {
        windowFrame.setVisible(false);
    }

    public void show() {
        windowFrame.setVisible(true);
        repaint();
    }

    public void setSize(int width, int height) {
        windowFrame.setSize(width, height);
        repaint();
    }

    public void repaint() {
        windowFrame.repaint();
    }

}

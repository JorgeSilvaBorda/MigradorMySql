
import com.alee.laf.WebLookAndFeel;

public class Main {
    public static void main(String[] args){
	WebLookAndFeel.install();
	WebLookAndFeel.setDecorateAllWindows(true);
	WebLookAndFeel.setDecorateDialogs(true);
	WebLookAndFeel.setDecorateFrames(true);
	Ventana v = new Ventana();
	v.setLocationRelativeTo(null);
	v.setVisible(true);
    }
}

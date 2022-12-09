package assessment;

public class MotifWidgetFactory extends WidgetFactory implements MotifWindow,MotifScrollBar {
	public void CreateWindow() {
		System.out.println("Motif Window created..!");
	}	
	public void CreateScrollBar() {
		System.out.println("Motif ScrollBar created..!");
	}
	
	
}

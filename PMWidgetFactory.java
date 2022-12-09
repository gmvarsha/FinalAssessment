package assessment;

public class PMWidgetFactory extends WidgetFactory implements PMWindow,PMScrollBar {
	public void CreateWindow() {
		System.out.println("PM Window created..!");
	}
	public void CreateScrollBar() {
		System.out.println("PM ScrollBar created..!");
	}
	
	
}

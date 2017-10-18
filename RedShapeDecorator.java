package test.decorator;

/**
 * װ������ʵ����
 * @author guoyujian
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		setRed(decoratedShape);
	}
	private void setRed(Shape decoratedShape) {
		System.out.println("set border color:red");
	}

}

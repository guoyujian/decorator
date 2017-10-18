package test.decorator;

/**
 * 装饰器抽象类：实现与组件一样的接口，并持有组件的引用
 * @author guoyujian
 *
 */
public abstract class ShapeDecorator implements Shape{
	protected Shape decoratedShape = null;
	
	public ShapeDecorator(Shape decoratedShape) {
		// TODO Auto-generated constructor stub
		this.decoratedShape=decoratedShape;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();
	}
}

package test.decorator;

public class Client {

	//test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new RedShapeDecorator(new Circle());
		shape.draw();
	}

}

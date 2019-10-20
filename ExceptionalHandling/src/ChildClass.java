
public class ChildClass extends ParentClass {
@Override
public void add() throws Exception{
	try {
		
	}catch(RuntimeException e) {
		throw new Exception(e);
	}
}
}

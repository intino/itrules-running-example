import io.intino.itrules.*;
import io.intino.itrules.parser.ITRulesSyntaxError;

public class Main {
	public static void main(String[] args) throws ITRulesSyntaxError {
		var reader = new TemplateReader(Main.class.getResourceAsStream("/Form.itr"));
		var engine = new Engine(reader.read());
		System.out.println(engine.render(frame()));
	}

	private static Frame frame() {
		return new FrameBuilder("form")
				.add("className", "UserForm")
				.add("field", fields())
				.toFrame();
	}

	private static Frame[] fields() {
		return new Frame[]{
				new FrameBuilder("field", "String")
						.add("name", "username")
						.add("type", "String")
						.add("defaultValue", "admin")
						.toFrame(),
				new FrameBuilder("field", "int")
						.add("name", "age")
						.add("type", "int")
						.add("defaultValue", 30)
						.toFrame()
		};
	}
}
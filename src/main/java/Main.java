import io.intino.itrules.Engine;
import io.intino.itrules.Frame;
import io.intino.itrules.FrameBuilder;
import io.intino.itrules.TemplateReader;
import io.intino.itrules.parser.ITRulesSyntaxError;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
	public static void main(String[] args) throws ITRulesSyntaxError, IOException {
		File dir = new File("gen/com/example/form");
		dir.mkdirs();
		var reader = new TemplateReader(Main.class.getResourceAsStream("/Form.itr"));
		var engine = new Engine(reader.read());
		String output = engine.render(frame());
		Files.writeString(new File(dir, "UserForm.java").toPath(), output);
		System.out.println(output);
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
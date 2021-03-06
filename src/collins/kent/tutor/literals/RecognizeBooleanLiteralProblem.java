package collins.kent.tutor.literals;

import java.util.Random;

import collins.kent.tutor.Problem;
import collins.kent.tutor.Meta;

@Meta(skill="Recognize literals of type boolean")
public class RecognizeBooleanLiteralProblem implements Problem {

	private String displayString;

	@Override
	public Problem generate(Random rng) {
		displayString = "" + rng.nextBoolean();
		return this;
	}


	@Override
	public String getStatement() {
		return "What is the type of the following literal value?\n  "
				+ displayString;
	}

	@Override
	public String getAnswer() {
			return "boolean";
	}

}

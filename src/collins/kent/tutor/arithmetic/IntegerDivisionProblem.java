package collins.kent.tutor.arithmetic;

import java.util.Random;

import collins.kent.tutor.Problem;
import collins.kent.tutor.Skill;

/***
 * Produces integer division problems. Avoids dividing by zero.
 * 
 * @author k. collins
 *
 */
@Skill(skill="Perform integer division on non-zero values")
public class IntegerDivisionProblem implements Problem {

	int operandLeft;
	int operandRight;

	@Override
	public Problem generate(Random rng) {
		operandLeft = rng.nextInt(5);
		operandRight = rng.nextInt(5);
		// avoid dividing by zero
		if (operandRight == 0)
			operandRight = 3;
		return this;
	}

	@Override
	public String getStatement() {
		return operandLeft + " / " + operandRight;
	}

	@Override
	public String getAnswer() {
		return Integer.toString(operandLeft / operandRight);
	}
}

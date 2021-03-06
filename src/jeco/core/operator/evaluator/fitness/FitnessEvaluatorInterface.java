package jeco.core.operator.evaluator.fitness;

import pacman.game.util.GameInfo;

public interface FitnessEvaluatorInterface {
	
	public double evaluate(GameInfo gi);
	public double worstFitness();
	public String getName();
	
}

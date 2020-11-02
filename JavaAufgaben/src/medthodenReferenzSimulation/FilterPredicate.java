package medthodenReferenzSimulation;

public interface FilterPredicate<T> {
    boolean isMatching(T candidate);
}
public class OverDue<E extends Book> {
    private E overDueElement;

    public OverDue(E overDueElement) {
        this.overDueElement = overDueElement;
    }

    public E getOverDueElement() {
        return overDueElement;
    }

}
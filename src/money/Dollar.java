
package money;

class Dollar {
    int amount;
    Dollar(int amount) {
        this.amount = amount;
    }
    void times(int mutiplier) {
        amount = amount * mutiplier;
    }
}

/**
 * Created by Oleg on 12.04.2016.
 */
public class Calculator {
    public Calculator() {
    }

    /**
     * результат вычисления
     */

    private int result;

    /**
     * Суммируем аргументы
     *
     * @param params Аргументы суммирования
     */
    public void add(int... params) {
        for (Integer param : params) {
            this.result += param;
        }
    }

    /**
     * получить результат выражиния
     *
     * @return результат вычисления
     */
    public int getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }


}


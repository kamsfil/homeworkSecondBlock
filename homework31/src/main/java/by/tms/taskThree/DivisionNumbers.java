package by.tms.taskThree;

public final class DivisionNumbers {

    public static float division(float dividend /*ДЕЛИМОЕ*/, float divisor /*ДЕЛИТЕЛЬ*/) {
        if (divisor == 0) {
            System.out.println("На ноль делить нельзя");
            return 0;
        }
        if (dividend == 0) {
            return 0;
        }

       return positiveNumbers(dividend,divisor);
    }


    public static float bringingPlus (float number){
        if (number < 0){
            return number * -1;
        }
        return number;
    }


    public static float positiveNumbers(float dividend, float divisor) {
        float number = 0.0f;       //ЧТО МОЖНО СДЕЛАТЬ С ЭТИМИ ПЕРЕМЕННЫМИ ,ВЫНЕСТИ ИХ В МЕТОД ИЛИ ТАК НОРМАЛЬНО ?
        float tenth = 0.0f;
        float hundredth = 0.0f;
        float thousandths = 0.0f;
        float result;

        float dividendNumber = bringingPlus(dividend);
        float divisorNumber = bringingPlus(divisor);

        for (float n = dividendNumber; n > 0; n = n - divisorNumber) {
            if (n < divisorNumber) {

                for (float t = n * 10; t > 0; t = t - divisorNumber) {
                    if (t < divisorNumber) {

                        for (float h = t * 10; h > 0; h = h - divisorNumber) {
                            if (h < divisorNumber) {

                                for (float i = h * 10; i > 0; i = i - divisorNumber) {
                                    if (i < divisorNumber) {
                                        continue;
                                    }
                                    thousandths = thousandths + 0.001f;
                                }
                                continue;
                            }
                            hundredth = hundredth + 0.01f;
                        }
                        continue;
                    }
                    tenth = tenth + 0.1f;
                }
                continue;
            }
            number++;
        }

        result = number + tenth + hundredth + thousandths;
        return numberSign(dividend,divisor,result);
    }


    public static float numberSign (float dividend, float divisor, float result){
        if ((dividend < 0 && divisor >= 0) || (dividend >= 0 && divisor < 0)){
            return result * -1;
        }
        return result;
    }
}
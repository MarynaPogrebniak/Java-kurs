public class tryCatch {

  public static void main(String[] args) {
    // Пример с выходом за пределы размера массива:
// Задать массив на 3 элемента
// Обратиться к элементу массива с индексом больше 3 - программа должна закончиться аварийно
// Применить try ... catch для обработки ошибки обращения за длину массива
// Протестировать программу

// Пример с делением на 0 и обработкой неправильного ввода (символы вместо чисел)
// Сделать калькуллятор для деления с защитой от деления на 0 и ввода символов вместо цифр

    int[] myArray = {10, 20, 30};
    for (int i = 0; i < myArray.length; i++) {
      System.out.println("Элемент массива " + i + "  - " + myArray[i]);


    }
    try {
      System.out.println("Элемент массива " + 4 + "  - " + myArray[10]);
    } catch (Exception e) {
      System.out.println(e.getMessage() + " Выход за длину массива");

    }


  }

}

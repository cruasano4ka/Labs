package org.example;

import org.example.exceptions.EmptyInputException;
import org.example.model.*;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FlatBuilder {

    Flat flat = new Flat();

    public void buildFlat() {
        flat.setName(inputName());
        flat.setCoordinates(inputCoordinates());
        flat.setCreationDate(new Date());
        flat.setArea(inputArea());
        flat.setNumberOfRooms(inputRooms());
        flat.setCentralHeating(inputCH());
        flat.setFurnish(inputFurnish());
        flat.setView(inputView());
        flat.setHouse(inputHouse());
    }

    public Flat getFlat() {
        return flat;
    }

    public String inputName() {
        return getValidStringInput("Введите название квартиры: ");
    }

    public Coordinates inputCoordinates() {
        Coordinates coordinates = new Coordinates();
        coordinates.setX(getValidFloatInput("Введите координату квартиры по Х в формате float: "));
        coordinates.setY(getValidIntInput("Введите координату по У в формате int: "));
        return coordinates;
    }

    public Long inputArea() {
        return getValidLongInput("Введите площадь квартиры в формате long: ");
    }

    public Long inputRooms() {
        return getValidLongInput("Введите количество комнат в квартире в формате long: ");
    }

    public Boolean inputCH() {
        return getValidBooleanInput("Укажите, есть ли у дома центральное отопление (да/нет): ");
    }

    public Furnish inputFurnish() {
        Scanner scanner = App.getInstance().getScanner();
        System.out.println("Выберите состояние мебели в доме: \nDESIGNER|FINE|BAD");
        while (true) {
            try {
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.isEmpty()) {
                    return null;
                }

                switch (input) {
                    case "designer":
                        return Furnish.DESIGNER;
                    case "fine":
                        return Furnish.FINE;
                    case "bad":
                        return Furnish.BAD;
                    default:
                        throw new IllegalArgumentException("Выбери из предложенного) \nDESIGNER|FINE|BAD ");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public View inputView() {
        Scanner scanner = App.getInstance().getScanner();
        System.out.println("Выберите вид из окна квартиры: \nPARK|BAD|NORMAL ");

        while (true) {
            try {
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.isEmpty()) {
                    return null;
                }

                switch (input) {
                    case "park":
                        return View.PARK;
                    case "bad":
                        return View.BAD;
                    case "normal":
                        return View.NORMAL;
                    default:
                        throw new IllegalArgumentException("Выбери из предложенного) \nPARK|BAD|NORMAL ");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public House inputHouse() {
        House house = new House();
        house.setName(getValidStringInput("Введите название дома: "));
        while (true) {
            try {
                Integer year = getValidIntInput("Введите возраст дома: ");
                if (year < 0 || year >277) {
                    throw new IllegalArgumentException("Возраст не может быть меньше 0 и больше 277");
                }
                else {
                    house.setYear(year);
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        house.setNumberOfLifts(getValidLongInput("Введите количество лифтов в доме: "));
        return house;
    }

    public static float getValidFloatInput(String prompt) {
        Scanner scanner = App.getInstance().getScanner();
        while (true) {
            try {
                System.out.println(prompt);
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    throw new EmptyInputException("Введите что нибудь! ");
                }

                return Float.parseFloat(input.replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("А это не число в формате float)) (разделитель . или ,) ");
            } catch (EmptyInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int getValidIntInput(String prompt) {
        Scanner scanner = App.getInstance().getScanner();
        while (true) {
            try {
                System.out.println(prompt);
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    throw new EmptyInputException("Введите что нибудь! ");
                }

                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("А это не целое число) ");
            } catch (EmptyInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static long getValidLongInput(String prompt) {
        Scanner scanner = App.getInstance().getScanner();
        while (true) {
            try {
                System.out.println(prompt);
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    throw new EmptyInputException("Введите что нибудь!  ");
                }

                long value = Long.parseLong(input);

                if (value <= 0) {
                    throw new IllegalArgumentException("Число должно быть больше 0 ");
                }

                return value;

            } catch (NumberFormatException e) {
                System.out.println("А это не целое число)) ");
            } catch (EmptyInputException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static Boolean getValidBooleanInput(String prompt) {
        Scanner scanner = App.getInstance().getScanner();
        while (true) {
            try {
                System.out.println(prompt);
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.isEmpty()) {
                    return null;
                }

                switch (input) {
                    case("да"):
                        return true;
                    case ("нет"):
                        return false;
                    default:
                        throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Чет не boolean) ");
            }
        }
    }

    public String getValidStringInput(String prompt) {
        Scanner scanner = App.getInstance().getScanner();
        System.out.println(prompt);
        String name = scanner.nextLine().trim();
        while (name == null || name.isEmpty()) {
            System.out.println("Название не может быть null/пустой строкой \nВведите название: ");
            name = scanner.nextLine().trim();
        }
        return name;
    }
}

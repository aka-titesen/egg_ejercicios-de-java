package comparador;

import entidad.HotelCinco;
import entidad.HotelCuatro;
import java.util.Comparator;

public class Comparador {

    public static Comparator<HotelCuatro> hCuatroCaroABarato = new Comparator<HotelCuatro>() {
        @Override
        public int compare(HotelCuatro o1, HotelCuatro o2) {
            return o2.getPrecioPorHabitaciones().compareTo(o1.getPrecioPorHabitaciones());
        }
    };

    public static Comparator<HotelCinco> hCincoCaroABarato = new Comparator<HotelCinco>() {
        @Override
        public int compare(HotelCinco o1, HotelCinco o2) {
            return o2.getPrecioPorHabitaciones().compareTo(o1.getPrecioPorHabitaciones());
        }
    };
}

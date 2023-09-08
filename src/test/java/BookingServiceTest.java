import com.max.BookingService;
import com.max.CantBookException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;

public class BookingServiceTest {

    @Spy
    BookingService bookingService = new BookingService();
    LocalDateTime localDateTime = LocalDateTime.now();


    @Test
    void positive() throws CantBookException {

        Mockito.when(bookingService.checkTimeInBD(any(),any())).thenReturn(true);
        Mockito.when(bookingService.createBook(any(),any(),any())).thenReturn(true);
        Boolean result = bookingService.book("100", localDateTime, localDateTime);
        Assertions.assertEquals(true,result);
        Mockito.verify(bookingService, Mockito.times(1)).checkTimeInBD(localDateTime,localDateTime);
        Mockito.verify(bookingService, Mockito.times(1)).createBook("100", localDateTime,localDateTime);
    }

    @Test
    void negative() {
        Mockito.when(bookingService.checkTimeInBD(localDateTime,localDateTime)).thenReturn(false);
        Mockito.when(bookingService.createBook(any(),any(),any())).thenReturn(true);
        //Assertions.assertThrows(CantBookException.class, ()->bookingService.book("100", LocalDateTime.now(), LocalDateTime.now()));
        Mockito.verify(bookingService, Mockito.times(1)).checkTimeInBD(localDateTime,localDateTime);
        Mockito.verify(bookingService, Mockito.never()).createBook("100", localDateTime,localDateTime);
    }
}

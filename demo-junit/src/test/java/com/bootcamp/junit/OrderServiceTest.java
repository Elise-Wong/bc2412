package com.bootcamp.junit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;


// ! Mockito
@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

  @Mock //mock走哂D dependency...扮拎到, TEST綜合
  private PaymentService paymentService; //mock object (without real implementation)

  @Mock //可重用object
  private InventoryService inventoryService; //mock object (without real implementation)


  @Test
  void testOrder_whenStockCountLargerThanZero(){
    // ! for this scenario, how do we perform Unit Test(UT)?
    // OrderService -> InventoryService 
    // -> PaymentService
    Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(10); //當XX, 就YY
    Mockito.when(this.inventoryService.deductStock()).thenReturn(true);
    Mockito.when(this.paymentService.pay()).thenReturn(true);

    OrderService os = new OrderService(this.paymentService, this.inventoryService);
    boolean orderResult = os.order();
    assertEquals(true, orderResult);

    verify(this.inventoryService, times(1)).checkAvailableStock();
    verify(this.inventoryService, times(1)).deductStock();
    verify(this.paymentService, times(1)).pay();


    assertDoesNotThrow(() -> os.order());
  }

  // assertThrow
  // ! unit test
  // 1. stock <= 0 -> throw
  // 2. pay() -> true, deductStock() -> true
  // 3. pay() -> false, deductStock() -> true
  // 4. pay() -> true, deductStock() -> false
  // 5. pay() -> false, deductStock() -> false

  @Test
  void testOrder_whenStockCountIsZero(){
    Mockito.when(this.inventoryService.checkAvailableStock()).thenReturn(0);

    OrderService os = new OrderService(this.paymentService, this.inventoryService);
    assertThrows(IllegalStateException.class, () -> os.order()); //Executable

    verify(this.inventoryService, times(1)).checkAvailableStock();
    verify(this.inventoryService, times(0)).deductStock();
    verify(this.paymentService, times(0)).pay();

  }




}

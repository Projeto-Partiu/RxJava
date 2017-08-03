/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 03 13:08:40 GMT 2017
 */

package io.reactivex.internal.observers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.FutureSingleObserver;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.sql.BatchUpdateException;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLNonTransientException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTransactionRollbackException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FutureSingleObserver_ESTest extends FutureSingleObserver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FutureSingleObserver<Object> futureSingleObserver0 = new FutureSingleObserver<Object>();
      FutureSingleObserver<Integer> futureSingleObserver1 = new FutureSingleObserver<Integer>();
      Integer integer0 = futureSingleObserver1.value;
      futureSingleObserver0.value = (Object) null;
      futureSingleObserver0.dispose();
      FutureSingleObserver<EmptyDisposable> futureSingleObserver2 = new FutureSingleObserver<EmptyDisposable>();
      futureSingleObserver2.isCancelled();
      FutureSingleObserver<ArrayListSupplier> futureSingleObserver3 = new FutureSingleObserver<ArrayListSupplier>();
      futureSingleObserver3.cancel(false);
      FutureSingleObserver<BackpressureOverflowStrategy> futureSingleObserver4 = new FutureSingleObserver<BackpressureOverflowStrategy>();
      ArrayListSupplier arrayListSupplier0 = ArrayListSupplier.INSTANCE;
      futureSingleObserver3.onSuccess(arrayListSupplier0);
      futureSingleObserver4.isCancelled();
      ArrayListSupplier arrayListSupplier1 = ArrayListSupplier.INSTANCE;
      futureSingleObserver3.onSuccess(arrayListSupplier1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FutureSingleObserver<Object> futureSingleObserver0 = new FutureSingleObserver<Object>();
      Integer integer0 = new Integer(210);
      futureSingleObserver0.onSuccess(integer0);
      futureSingleObserver0.get();
      FutureSingleObserver<SerialDisposable> futureSingleObserver1 = new FutureSingleObserver<SerialDisposable>();
      futureSingleObserver1.isCancelled();
      FutureSingleObserver<EmptyDisposable> futureSingleObserver2 = new FutureSingleObserver<EmptyDisposable>();
      BooleanSupplier booleanSupplier0 = mock(BooleanSupplier.class, new ViolatedAssumptionAnswer());
      RxJavaPlugins.setOnBeforeBlocking(booleanSupplier0);
      futureSingleObserver2.cancel(false);
      futureSingleObserver0.get();
      FutureSingleObserver<NotificationLite> futureSingleObserver3 = new FutureSingleObserver<NotificationLite>();
      int[] intArray0 = new int[4];
      intArray0[0] = 210;
      intArray0[1] = (-1435);
      intArray0[2] = 210;
      intArray0[3] = 210;
      BatchUpdateException batchUpdateException0 = new BatchUpdateException(intArray0);
      SQLException sQLException0 = new SQLException("N7HU", batchUpdateException0);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("BOUNDARY", "", sQLException0);
      SQLNonTransientException sQLNonTransientException0 = new SQLNonTransientException("BOUNDARY", "BOUNDARY", (-1435), sQLIntegrityConstraintViolationException0);
      futureSingleObserver3.onError(sQLNonTransientException0);
      assertEquals("BOUNDARY", sQLNonTransientException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FutureSingleObserver<HashMapSupplier> futureSingleObserver0 = new FutureSingleObserver<HashMapSupplier>();
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException("", "", (-5189), sQLIntegrityConstraintViolationException0);
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[2];
      StackTraceElement stackTraceElement0 = new StackTraceElement("$2~", "|FT>@{6TjV~|J8AHPBL", "eN$sOH#Z", 1833);
      stackTraceElementArray0[0] = stackTraceElement0;
      StackTraceElement stackTraceElement1 = new StackTraceElement("k", "|FT>@{6TjV~|J8AHPBL", "SHSowkxO4h7j_)WbZR,", (-1418));
      stackTraceElementArray0[1] = stackTraceElement1;
      sQLTransactionRollbackException0.setStackTrace(stackTraceElementArray0);
      futureSingleObserver0.onError(sQLTransactionRollbackException0);
      futureSingleObserver0.isDone();
      FutureSingleObserver<BackpressureStrategy> futureSingleObserver1 = new FutureSingleObserver<BackpressureStrategy>();
      futureSingleObserver1.dispose();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FutureSingleObserver<Object> futureSingleObserver0 = new FutureSingleObserver<Object>();
      futureSingleObserver0.isDone();
      FutureSingleObserver<EmptySubscription> futureSingleObserver1 = new FutureSingleObserver<EmptySubscription>();
      futureSingleObserver1.countDown();
      futureSingleObserver1.get();
      EmptySubscription emptySubscription0 = EmptySubscription.INSTANCE;
      futureSingleObserver1.cancel(false);
      futureSingleObserver1.value = emptySubscription0;
      // Undeclared exception!
      try { 
        futureSingleObserver1.get();
        fail("Expecting exception: CancellationException");
      
      } catch(CancellationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.reactivex.internal.observers.FutureSingleObserver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FutureSingleObserver<SubscriptionHelper> futureSingleObserver0 = new FutureSingleObserver<SubscriptionHelper>();
      futureSingleObserver0.cancel(false);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      futureSingleObserver0.isDisposed();
      futureSingleObserver0.await(0L, timeUnit0);
      // Undeclared exception!
      try { 
        futureSingleObserver0.get();
        fail("Expecting exception: CancellationException");
      
      } catch(CancellationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.reactivex.internal.observers.FutureSingleObserver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FutureSingleObserver<Object> futureSingleObserver0 = new FutureSingleObserver<Object>();
      CompositeDisposable compositeDisposable0 = new CompositeDisposable();
      futureSingleObserver0.onSubscribe(compositeDisposable0);
      assertFalse(compositeDisposable0.isDisposed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FutureSingleObserver<DisposableHelper> futureSingleObserver0 = new FutureSingleObserver<DisposableHelper>();
      futureSingleObserver0.countDown();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      futureSingleObserver0.get(1L, timeUnit0);
      futureSingleObserver0.cancel(true);
      futureSingleObserver0.cancel(true);
      FutureSingleObserver<CompositeDisposable> futureSingleObserver1 = new FutureSingleObserver<CompositeDisposable>();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      RxJavaPlugins.setErrorHandler(consumer0);
      CompositeDisposable compositeDisposable0 = null;
      try {
        compositeDisposable0 = new CompositeDisposable((Iterable<? extends Disposable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // resources is null
         //
         verifyException("io.reactivex.internal.functions.ObjectHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FutureSingleObserver<DisposableHelper> futureSingleObserver0 = new FutureSingleObserver<DisposableHelper>();
      futureSingleObserver0.countDown();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      futureSingleObserver0.get(0L, timeUnit0);
      DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
      futureSingleObserver0.onSuccess(disposableHelper0);
      FutureSingleObserver<EmptySubscription> futureSingleObserver1 = new FutureSingleObserver<EmptySubscription>();
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException("", "");
      futureSingleObserver1.onError(sQLNonTransientConnectionException0);
      FutureSingleObserver<CompositeDisposable> futureSingleObserver2 = new FutureSingleObserver<CompositeDisposable>();
      futureSingleObserver2.cancel(false);
      futureSingleObserver1.isDisposed();
      TimeUnit timeUnit1 = TimeUnit.SECONDS;
      try { 
        futureSingleObserver1.get(0L, timeUnit1);
        fail("Expecting exception: ExecutionException");
      
      } catch(ExecutionException e) {
         //
         // java.sql.SQLNonTransientConnectionException: 
         //
         verifyException("io.reactivex.internal.observers.FutureSingleObserver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FutureSingleObserver<SubscriptionHelper> futureSingleObserver0 = new FutureSingleObserver<SubscriptionHelper>();
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException("Ne5i/6-$\"fb+)Und]_", "M,.*Ny}P");
      futureSingleObserver0.onError(sQLSyntaxErrorException0);
      futureSingleObserver0.cancel(true);
      FutureSingleObserver<ErrorMode> futureSingleObserver1 = new FutureSingleObserver<ErrorMode>();
      futureSingleObserver1.cancel(false);
      try { 
        futureSingleObserver0.get();
        fail("Expecting exception: ExecutionException");
      
      } catch(ExecutionException e) {
         //
         // java.sql.SQLSyntaxErrorException: Ne5i/6-$\"fb+)Und]_
         //
         verifyException("io.reactivex.internal.observers.FutureSingleObserver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FutureSingleObserver<BackpressureStrategy> futureSingleObserver0 = new FutureSingleObserver<BackpressureStrategy>();
      futureSingleObserver0.cancel(false);
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      // Undeclared exception!
      try { 
        futureSingleObserver0.get(2711L, timeUnit0);
        fail("Expecting exception: CancellationException");
      
      } catch(CancellationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.reactivex.internal.observers.FutureSingleObserver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FutureSingleObserver<BackpressureStrategy> futureSingleObserver0 = new FutureSingleObserver<BackpressureStrategy>();
      // Undeclared exception!
      try { 
        futureSingleObserver0.onSubscribe((Disposable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // d is null
         //
         verifyException("io.reactivex.internal.functions.ObjectHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FutureSingleObserver<ArrayListSupplier> futureSingleObserver0 = new FutureSingleObserver<ArrayListSupplier>();
      futureSingleObserver0.dispose();
      FutureSingleObserver<DisposableHelper> futureSingleObserver1 = new FutureSingleObserver<DisposableHelper>();
      boolean boolean0 = futureSingleObserver1.isCancelled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FutureSingleObserver<Integer> futureSingleObserver0 = new FutureSingleObserver<Integer>();
      futureSingleObserver0.isCancelled();
      FutureSingleObserver<BackpressureStrategy> futureSingleObserver1 = new FutureSingleObserver<BackpressureStrategy>();
      SQLDataException sQLDataException0 = new SQLDataException("mo)eB");
      futureSingleObserver1.onError(sQLDataException0);
      assertNull(sQLDataException0.getSQLState());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FutureSingleObserver<ArrayListSupplier> futureSingleObserver0 = new FutureSingleObserver<ArrayListSupplier>();
      futureSingleObserver0.isDisposed();
      long long0 = 0L;
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      try { 
        futureSingleObserver0.get(0L, timeUnit0);
        fail("Expecting exception: TimeoutException");
      
      } catch(TimeoutException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.reactivex.internal.observers.FutureSingleObserver", e);
      }
  }
}

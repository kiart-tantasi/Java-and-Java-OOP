import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyCompletableFuture {
        public static void main(String[] args) throws ExecutionException, InterruptedException {

                // 1. supplyAsync
                // CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
                // String threadName = Thread.currentThread().getName();
                // System.out.println("supplyAsync Thread Name: " + threadName);
                // try {
                // Thread.sleep(2000);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                // return "SUCCESS";
                // });
                // System.out.println("supplyAsync: " + cf.get());

                // 2. runAsync
                // CompletableFuture<Void> cfVoid = CompletableFuture.runAsync(() -> {
                // String threadName = Thread.currentThread().getName();
                // System.out.println("runAsync Thread Name: " + threadName);
                // try {
                // Thread.sleep(2000);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                // });
                // // no point of using .join() or .get() with runAsync because it will return
                // null
                // System.out.println("runAsync: " + cfVoid.get());

                // 3. chain multitasks
                // CompletableFuture<Integer> integerCf = CompletableFuture.supplyAsync(() -> {
                // return 1;
                // })
                // .thenApplyAsync(number -> {
                // try {
                // Thread.sleep(2000);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                // System.out.println("NUMBER: " + number);
                // return number * 10;
                // })
                // .thenApplyAsync(number -> {
                // try {
                // Thread.sleep(2000);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                // System.out.println("Multiplied by 10 = " + number);
                // return number ;
                // })
                // .whenCompleteAsync((result, throwable) -> {
                // try {
                // Thread.sleep(2000);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                // System.out.println("FINAL RESULT: " + result);
                // System.out.println("THROWABLE: " + throwable);
                // });
                // integerCf.get();

                // 4.1 combine CompletableFutures together (allOf)

                // // cf1
                // CompletableFuture<Integer> firstValue = CompletableFuture.supplyAsync(() -> {
                // try {
                // Thread.sleep(3000);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                // return 15;
                // });
                //
                // // cf2
                // CompletableFuture<Integer> secondValue = CompletableFuture.supplyAsync(() ->
                // {
                // try {
                // Thread.sleep(3000);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                // return 5;
                // });
                //
                // // allOf
                // CompletableFuture<Void> allCfs =
                // CompletableFuture.allOf(firstValue,secondValue);
                //
                // allCfs.whenComplete((result, throwable) -> {
                // try {
                // System.out.println("First Value: " + firstValue.get());
                // System.out.println("Second Value: " + secondValue.get());
                // } catch (InterruptedException | ExecutionException e) {
                // e.printStackTrace();
                // }
                // if (throwable == null) System.out.println("SUCCESS!");
                // else System.out.println("FAILED!");
                // });
                //
                // allCfs.get();

                // 4.2.1 Multiple Futures in Parallel (allOf)

                // // cf1
                // CompletableFuture<String> future1
                // = CompletableFuture.supplyAsync(() -> "Hello");
                //
                // // cf2
                // CompletableFuture<String> future2
                // = CompletableFuture.supplyAsync(() -> {
                // try {
                // Thread.sleep(3000);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                // return "Beautiful";
                // });
                //
                // // cf3
                // CompletableFuture<String> future3
                // = CompletableFuture.supplyAsync(() -> "World");
                //
                // // allOf
                // CompletableFuture<Void> allCfs = CompletableFuture.allOf(future1, future2,
                // future3);
                //
                // allCfs.get();
                // System.out.println(future1.isDone());
                // System.out.println(future2.isDone());
                // System.out.println(future3.isDone());
                // System.out.println(future1.get() + " " + future2.get() + " " +
                // future3.get());
                //
                // // 4.2.2 to keep results in a variable
                // String combined = Stream.of(future1, future2, future3)
                // .map(CompletableFuture::join)
                // .collect(Collectors.joining(" . "));
                //
                // System.out.println("COMBINED: " + combined);

                // 5. Future
                // Future<String> futureString = MyCompletableFuture.numberAsync(); // static
                // method
                // String stringResult = futureString.get();
                // System.out.println("RESULT: " + stringResult);
                //
                // Future<Integer> futureInteger = MyCompletableFuture.integerAsync();
                // Integer intResult = futureInteger.get();
                // System.out.println("INT RESULT: " + intResult);

                // 6. thenApply // thenAccept // thenRun
                // CompletableFuture<Integer> firstNum = CompletableFuture.supplyAsync(() -> 5);
                //
                // // thenApply (return value)
                // CompletableFuture<Integer> additionResult = firstNum.thenApply((num) -> num +
                // 15);
                // // use .get() to show returned value
                // System.out.println("RESULT(thenApply): " + additionResult.get() + " (with
                // returned value)");
                //
                // // thenAccept (Void)
                // CompletableFuture<Void> additionResultVoid = firstNum.thenAccept((num) -> {
                // System.out.println("RESULT(thenAccept): " + (num + 15));
                // });
                //
                // // thenRun (does not return value or sout)
                // CompletableFuture<Void> additionResultThenRun = firstNum.thenRun(() -> {
                // System.out.println("RESULT(thenRun): COMPLETE !");
                // });

                // 7. thenCompose (num1 -> future2 -> num1 + num2)
                // CompletableFuture<Integer> thenComposeFuture =
                // CompletableFuture.supplyAsync(() -> 10) // future1
                // .thenCompose(num -> CompletableFuture.supplyAsync(() -> (num + 1))); //
                // future2 and // num1 + num2
                // System.out.println("thenCompose: " + thenComposeFuture.get());

                // 8. thenCombine (future1 -> future2 -> num1 + num 2) // like combining of
                // thenApply
                // CompletableFuture<Integer> thenCombineFutureTwo =
                // CompletableFuture.supplyAsync(() -> 50);
                //
                // CompletableFuture<Integer> thenCombineFutureOne =
                // CompletableFuture.supplyAsync(() -> 20) // future1
                // .thenCombine(
                // thenCombineFutureTwo, // future2
                // (one, two) -> one + two // num1 + num2
                // );
                //
                // System.out.println("thenCombine: " + thenCombineFutureOne.get());

                // 9. thenAcceptBoth // just like thenAccept (returned value to sout)
                // CompletableFuture<Integer> thenAcceptBothFutureTwo =
                // CompletableFuture.supplyAsync(() -> 200);
                //
                // CompletableFuture<Void> thenAcceptBothFutureOne =
                // CompletableFuture.supplyAsync(() -> 100)
                // .thenAcceptBoth(
                // thenAcceptBothFutureTwo,
                // (one, two) -> {
                // System.out.println("thenAcceptBoth: " + (one + two));
                // }
                // );

                // 10. thenApply vs thenCompose

                // // 1: thenApply (with another value)
                // CompletableFuture<Integer> intFutureOne = CompletableFuture.supplyAsync(() ->
                // 222);
                //
                // CompletableFuture<Integer> thenApplyFinalResult = intFutureOne
                // .thenApply(num -> num + 111);
                //
                // System.out.println("FINAL RESULT(thenApply): " + thenApplyFinalResult.get());
                //
                // // 2: thenCompose (with another method)
                // CompletableFuture<Integer> firstIntFuture = CompletableFuture.supplyAsync(()
                // -> 111);
                //
                // CompletableFuture<Integer> thenComposeFinalResult = firstIntFuture
                // .thenCompose(num -> CompletableFuture.supplyAsync(() -> (num + 1000)));
                //// .thenCompose(MyCompletableFuture::computeAnother);
                //
                // System.out.println("FINAL RESULT(thenCompose): " +
                // thenComposeFinalResult.get());

                // 11 Handle Exceptions ( .handle((result,throwable)) after .supplyAsync() )
                // 1:
                // CompletableFuture<String> errorFuture = CompletableFuture.supplyAsync(() -> {
                // if (2 > 1) throw new RuntimeException("error test !");
                // return "100";
                // })
                // .handle((result, throwable) -> {
                // System.out.println("RESULT: " + result);
                // System.out.println("THROWABLE: " + throwable);
                // return result == "100" ? "SUCCESS" : "FAILED";
                // });
                // System.out.println("Error Future: " + errorFuture.get());

                // 2:
                // CompletableFuture<String> errorFutureTwo = CompletableFuture.supplyAsync(()
                // -> "SUCCESS");
                // errorFutureTwo.completeExceptionally(
                // new RuntimeException("FAILED")
                // );
                // try {
                // System.out.println("Result: " + errorFutureTwo.get());
                // } catch (InterruptedException | ExecutionException | RuntimeException e) {
                // System.out.println("Exception: " + e.getMessage());
                // }

                // 12. Async Method (thenApplyAsync) more efficient than sync methods (to
                // parallelize our computation) // !!! async methods only work with .get() /
                // .join()
                // CompletableFuture<String> asyncFuture = CompletableFuture.supplyAsync(() -> {
                // try {
                // Thread.sleep(2000);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                // System.out.println("SupplyAsync is working...");
                // return "Hello World";
                //
                // })
                // .thenApplyAsync(result -> {
                // try {
                // Thread.sleep(2000);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                // System.out.println("ThenApply is working...");
                // return result;
                // }) // It could be "thenAcceptAsync" or "thenRunAsync"
                // .thenApplyAsync(result -> {
                // try {
                // Thread.sleep(2000);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                // System.out.println("ThenApply 2 is working...");
                // return result;
                // })
                // .whenCompleteAsync((result,throwable) -> {
                // System.out.println("COMPLETE.");
                // });
                //
                // System.out.println("asyncFuture: " + asyncFuture.get());

                // 13. CompletableFuture + HttpClient Example
                // CompletableFuture<String> httpClientFuture = CompletableFuture.supplyAsync(()
                // -> {
                // // client request response
                // HttpClient httpClient = HttpClient.newHttpClient();
                // HttpRequest request =
                // HttpRequest.newBuilder().uri(URI.create("https://petch.blog/api/articles/petchdotblog-admin-system")).build();
                // HttpResponse<String> response = null;
                //
                // try {
                // response = httpClient.send(request, HttpResponse.BodyHandlers.ofString()); //
                // send request and save data into response
                // } catch (IOException | InterruptedException e) {
                // e.printStackTrace();
                // }
                //
                // String jsonString = response.body();
                // return jsonString;
                // });
                // System.out.println("HttpClientFuture: " + httpClientFuture.get());

        }

        // --- static method --- //

        // 5.
        public static Future<String> numberAsync() throws InterruptedException {
                CompletableFuture<String> cf = new CompletableFuture<>();

                Executors.newCachedThreadPool().submit(() -> {
                        Thread.sleep(3000);
                        cf.complete("Hello");
                        return null;
                });
                return cf;
        }

        public static Future<Integer> integerAsync() throws InterruptedException {
                CompletableFuture<Integer> cf = new CompletableFuture<>();

                Executors.newCachedThreadPool().submit(() -> {
                        Thread.sleep(3000);
                        cf.complete(50);
                        return null;
                });
                return cf;
        }

        // 10.
        static CompletableFuture<Integer> compute(Integer i) {
                return CompletableFuture.supplyAsync(() -> i);
        }

        static CompletableFuture<Integer> computeAnother(Integer i) {
                return CompletableFuture.supplyAsync(() -> i + 1000);
        }
}

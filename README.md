### RxJava 使用简介

一、四个基本概念
  
  1.Observable：被观察者，决定什么时候触发事件，以及触发什么样的事件；
  
  2.Observer/Subscriber  ： 观察者，决定了事件触发时，采取什么行为；Subscriber是Observer接口的实现；
  
  3.Subscribe： 订阅，用于连接observable和observer；
  
  4.事件 ：  包括onNext()、onCompleted()、onError()等；
  
二、创建Observable

  ```java
  Observable<String> mObservable = Observable.create(new Observable.OnSubscribe<String>() {
           
           @Override
            public void call(Subscriber<? super String> subscriber) {

            }
        });
  ```

三、订阅动作

  1.`observable.subscribe(observer);` 或 `onservable.subscribe(subscriber);`
  
四、其他概念

  1.Schedulers ：调度
  
  2.Disposable：可被清除的资源；
  
  2.CompositeDisposable ： 复合的随意使用，快速解除所有添加的`Disposable`类；

package com.nkmr.myasync

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jdeferred.Deferred
import org.jdeferred.DoneCallback
import org.jdeferred.impl.DeferredObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var deferred = DeferredObject()
//        var promise = deferred.promise()
//        promise.done(DoneCallback {
//            public void onDone(Object result) {
//
//            }
//        }).fail(new FailCallback() {
//            public void onFail(Object rejection) {
//
//            }
//        }).progress(new ProgressCallback() {
//            public void onProgress(Object progress) {
//
//            }
//        }).always(new AlwaysCallback() {
//            public void onAlways(State state, Object result, Object rejection) {
//
//            }
//        })
    }
}

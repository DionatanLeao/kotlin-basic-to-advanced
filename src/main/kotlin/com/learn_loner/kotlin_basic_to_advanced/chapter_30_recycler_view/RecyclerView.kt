package com.learn_loner.kotlin_basic_to_advanced.chapter_30_recycler_view

//import javax.swing.plaf.ToolBarUI

//class MainActivity : AppCompatActivity() {
//    lateinit var mRecyclerView : RecyclerView
//    val mAdapter : RecyclerAdapter = RecyclerAdapter()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity.main)
//        val toolbar = findViewById(R.id.toolbar) as ToolBarUI
//        setSupportActionBar(toolbar)
//
//        mRecyclerView = findViewById(R.id.recycler_view) as RecyclerView
//
//        mRecyclerView.setHasFixedSize(true)
//        mRecyclerView.layoutManager = LinearLayoutManager(this)
//        mAdapter.RecyclerAdapter(getList(), this)
//        mRecyclerView.adapter = mAdapter
//
//        private fun getList() : ArrayList<String> {
//            var list : ArrayList<String> = ArrayList()
//            for (i in 1..10) {
//                println(i)
//                list.add("$i")
//            }
//            return list
//        }
//    }
//}
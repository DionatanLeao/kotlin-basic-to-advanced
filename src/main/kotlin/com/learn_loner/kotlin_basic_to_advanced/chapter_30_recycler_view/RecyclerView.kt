package com.learn_loner.kotlin_basic_to_advanced.chapter_30_recycler_view

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
//
//class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
//    var mItems: ArrayList<String> = ArrayList()
//    lateinit var mClick : OnClick
//
//    fun RecyclerAdapter(item: ArrayList<String>, mClick: OnClick) {
//        this.mItems = item
//        this.mClick = mClick
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val item = mItems[position]
//        holder.bind(item, mClick, position)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        return ViewHolder(layoutInflater.inflate(R.layout.main.item, parent, false))
//    }
//
//    override fun getItemCount(): Int {
//        return mItems.size
//    }
//}
//
//class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
//    val card = view.findViewById(R.id.card) as TextView
//
//    fun bind(str: String, mClick: OnClick, position: Int) {
//        card.text = str
//        card.setOnClickListener { view ->
//            mClick.onClickListener(position)
//        }
//    }
//}
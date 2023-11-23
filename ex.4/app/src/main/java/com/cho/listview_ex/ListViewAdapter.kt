package com.cho.listview_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
class ListViewAdapter(val List: MutableList<ListviewModel>):BaseAdapter() {
//class ListViewAdapter(val List: MutableList<String>):BaseAdapter() {
        override fun getCount(): Int { //리스트 뷰의 갯수
      return List.size; //리스트의 갯수는 아이탬의 갯수만큼 하겠다.
    }

    override fun getItem(position: Int): Any {
       return List[position];
    }

    override fun getItemId(position: Int): Long {
       return position.toLong();
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
  var convertView= convertView

        if(convertView==null) { //아이탬 리스트 뷰를 가져오는 단계
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false);
        }

      val title=  convertView!!.findViewById<TextView>(R.id.listviewItem);
        val content =convertView!!.findViewById<TextView>(R.id.listviewItem2)

//        title.text=List[position]
        title.text=List[position].title
        content.text=List[position].content
//        title.text=List[position].content
        //list[0] -> ListViewModel("a","b") //타이틀을 가져다 오면 a,c,e
        //list[1] -> ListViewModel("c","d") //  컨택트 를 가져온다 하면 b,d,f
        //list[2] -> ListViewModel("e","f")  // 두개 다 원하면 택스트뷰를 2개 만들면 된다.


        return convertView!!
        }

    }



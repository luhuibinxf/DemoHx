package com.feicui.edu.demo;


import android.os.Bundle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.hyphenate.chat.EMMessage;
import com.hyphenate.easeui.EaseConstant;
import com.hyphenate.easeui.ui.EaseChatFragment;
import com.hyphenate.easeui.widget.EaseChatMessageList;

public class ChatActivity extends AppCompatActivity {
    // 当前聊天的 ID
    private String mChatId;
    private int mChattype;
    private EaseChatFragment chatFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        ActionBar mBar=getActionBar();
        ActionBar mBar = getSupportActionBar();
        mBar.hide();


//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        //去掉Activity上面的状态栏
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
        setContentView(R.layout.activity_chat);
        mChatId = getIntent().getStringExtra("userId");
        mChattype = getIntent().getIntExtra("chatType", 0);
//        Log.e("kjdhhjshsj", mChatId);
        //new出EaseChatFragment或其子类的实例
//        chatFragment = new EaseChatFragment();

//        //        // 将参数传递给聊天界面
//        chatFragment.setArguments(getIntent().getExtras());
//        getSupportFragmentManager().beginTransaction().add(R.id.ec_layout_container, chatFragment).commit();


        // 这里直接使用EaseUI封装好的聊天界面
        chatFragment = new EaseChatFragment();
        // 将参数传递给聊天界面
        chatFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().
                add(R.id.ec_layout_container, chatFragment).commit();


//        EaseChatMessageList messageList = (EaseChatMessageList) this.findViewById(R.id.message_list);
//        messageList.init(mChatId, mChattype, null);
//        messageList.setItemClickListener(new EaseChatMessageList.MessageListItemClickListener() {
//            //头像点击事件
//            @Override
//            public void onUserAvatarClick(String username) {
//                Toast.makeText(ChatActivity.this, "头像点击事件", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onUserAvatarLongClick(String username) {
//
//            }
//
//            //重发消息按钮点击事件
//            @Override
//            public void onResendClick(final EMMessage message) {
//                Toast.makeText(ChatActivity.this, "重发消息按钮点击事件", Toast.LENGTH_SHORT).show();
//            }
//
//            //气泡框长按事件
//            @Override
//            public void onBubbleLongClick(EMMessage message) {
//                Toast.makeText(ChatActivity.this, "气泡框长按事件", Toast.LENGTH_SHORT).show();
//            }
//
//            //气泡框点击事件，EaseUI有默认实现这个事件，如果需要覆盖，return值要返回true
//            @Override
//            public boolean onBubbleClick(EMMessage message) {
//                return false;
//            }
//        });
    }

}

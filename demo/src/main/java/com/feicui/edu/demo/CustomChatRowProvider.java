//package com.feicui.edu.demo;
//
//import android.widget.BaseAdapter;
//
//import com.hyphenate.chat.EMMessage;
//import com.hyphenate.easeui.widget.chatrow.EaseChatRow;
//import com.hyphenate.easeui.widget.chatrow.EaseCustomChatRowProvider;
//
///**
// * Created by Administrator on 2017/4/19 0019.
// */
//
//public final  class CustomChatRowProvider implements EaseCustomChatRowProvider {
//    @Override
//    public int getCustomChatRowTypeCount() {
//        //音、视频通话发送、接收共4种
//        return 4;
//    }
//
//    @Override
//    public int getCustomChatRowType(EMMessage message) {
//        if(message.getType() == EMMessage.Type.TXT){
//            //语音通话类型
//            if (message.getBooleanAttribute(Constant.MESSAGE_ATTR_IS_VOICE_CALL, false)){
//                return message.direct == EMMessage.Direct.RECEIVE ? MESSAGE_TYPE_RECV_VOICE_CALL : MESSAGE_TYPE_SENT_VOICE_CALL;
//            }else if (message.getBooleanAttribute(Constant.MESSAGE_ATTR_IS_VIDEO_CALL, false)){
//                //视频通话
//                return message.direct == EMMessage.Direct.RECEIVE ? MESSAGE_TYPE_RECV_VIDEO_CALL : MESSAGE_TYPE_SENT_VIDEO_CALL;
//            }
//        }
//        return 0;
//    }
//
//    @Override
//    public EaseChatRow getCustomChatRow(EMMessage message, int position, BaseAdapter adapter) {
//        if(message.getType() == EMMessage.Type.TXT){
//            // 语音通话、视频通话
//            if (message.getBooleanAttribute(Constant.MESSAGE_ATTR_IS_VOICE_CALL, false) ||
//                    message.getBooleanAttribute(Constant.MESSAGE_ATTR_IS_VIDEO_CALL, false)){
//                //ChatRowVoiceCall为一个继承自EaseChatRow的类
//                return new ChatRowVoiceCall(getActivity(), message, position, adapter);
//            }
//        }
//        return null;
//    }
//}

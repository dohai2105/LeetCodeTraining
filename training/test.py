# coding=utf8
message_json2 = {
    "sender": "TOKYO創業ステーション",
    "from": "support@startup-station.jp",
    "to": "tokyo-startup_aws@hitachi-systems.com",
    "cc": "",
    "bcc": [
        "manju_tak@ceres.ocn.ne.jp",
        "manju.tak@athena.ocn.ne.jp"
    ],
    "subject": "［テスト環境］【TOKYO創業ステーション】パスワード再設定手続きのご案内",
    "content": "\r\n操作研修　テスト　様\r\n\r\n以下のURLからパスワードを再設定してください。\r\n※URLの有効期間は、メールが送信されてから48時間です。\r\n\r\nhttps://test.startup-station.jp/mypage/EHB0101?key=233679adde99d1402d2626b0f3e0fc0811ec8292240ec90560bb314bd56b1bb4\r\n\r\n※本メールにお心当たりのない方は、お手数ですが、削除していただけますようお願い申し上げます。\r\n※こちらのメールアドレスは送信専用です。返信いただきましてもご返答できませんのであらかじめご了承ください。\r\n\r\n────────────────────────────────────────────────────\r\n　TOKYO創業ステーション\r\n　〒100-0005\r\n　東京都千代田区丸の内2-1-1　明治安田生命ビル低層棟1階・2階\r\n　TEL: 03-5220-1141\r\n────────────────────────────────────────────────────\r\n　TOKYO創業ステーションTAMA\r\n　〒190-0014\r\n　東京都立川市緑町3-1　E2 301・303\r\n　TEL: 042-518-9671\r\n────────────────────────────────────────────────────\r\n管理・運営：(公財) 東京都中小企業振興公社\r\n"}

if message_json2['bcc'] == None or not message_json2['bcc']:
    _bcc = []
elif isinstance(message_json2['bcc'], str):
    _bcc = [message_json2['bcc']]
else:
    _bcc = message_json2['bcc']

print(_bcc)



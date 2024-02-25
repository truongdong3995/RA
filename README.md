# ユーザー情報一覧API
  - ユーザー情報データ用のインターフェースを作成する

## APIレイアウト
  ![L_9001_ユーザー情報](data:image/jpeg;base64,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)
  - [L_9001_ユーザー情報_XML](./xml/L_9001_ユーザー情報.drawio.xml)

## API一覧

| No | ID | API名 | 備考 | 
| --- | --- | --- | --- |
| 1   | L_9001_001 | ユーザー情報_取得 |-|
| 2   | L_9001_002 | ユーザー情報_検索 |-|
| 3   | L_9001_003 | ユーザー情報_登録 |-|
| 4   | L_9001_004 | ユーザー情報_更新 |-|
| 5   | L_9001_005 | ユーザー情報_削除 |-|
| 6   | L_9001_006 | ユーザー情報_一括登録 |-|

## エンティティ一覧

| No | ID | エンティティ名 | 備考 | 
| :---: | --- | --- | --- |
| 1   | UserInfo | ユーザー情報 |-|

## L_9001_001_ユーザー情報_取得 (userInfo/getUserInfo)
  - 指定したユーザーIDのユーザー情報を取得する

### INPUT
  - ユーザーID

### OUTPUT
  - `ユーザー情報`エンティティ

### メソッド
  - GET

### APIの詳細処理
1. INPUTデータをチェックする
  - `INPUT.ユーザーID`が存在しない場合、下記のメッセージを返却して、処理を終了する。
    - ステータスコード：500
    - メッセージ内容：「指定したユーザーIDが不正です。再確認してください。」

2. DBに接続して、下記の情報通りにユーザー情報を取得する
  - INPUT:
      - ユーザー情報.ユーザーID = INPUT.ユーザーID
  - OUTPUT:
    - `ユーザー情報`

3. 上記の処理で`ユーザー情報`が取得できなかった場合、下記のメッセージを返却して、処理を終了する。
  - ステータスコード：400
  - メッセージ内容：「指定したユーザーIDが見つかれません。再確認してください。」

4. 上記の処理で`ユーザー情報`が取得できた場合、`ユーザー情報`を返却して、処理を終了する。



## L_9001_006_ユーザー情報_一括登録 (userInfo/RegisterAllUserInfo)
  - 指定したユーザー情報リスト(A)を登録する。

### INPUT
  - ユーザー情報リスト`(A)`

### OUTPUT
  - `ユーザー情報リスト`エンティティ

### メソッド
  - POST

### APIの詳細処理

1. INPUTデータをチェックする
  - INPUT.ユーザー情報リスト`A`が存在しない場合、下記のメッセージを返却して、処理を終了する。
    - ステータスコード：400
    - メッセージ内容：「登録対象ユーザー情報リストを指定してください。」

2. 登録又は更新データを分別する
  - ユーザー情報登録リスト`(A1)`を定義する。
  - ユーザー情報更新リスト`(A2)`を定義する。
  - ユーザー情報リスト`(A)`を繰り返し、ユーザー情報`(B)`を取得する。
    - L_9001_001_ユーザー情報_取得APIを呼び出し、ユーザー情報`(B1)`を取得する。
      - INPUT:
        - ユーザー情報.ユーザーID = `(B)`.ユーザーID
      - OUTPUT:
         - ユーザー情報`(B1)`

    - ユーザー情報`(B1)`が取得できなかった場合、`(A1)`に`(B1)`を追加する。
    - ユーザー情報`(B1)`が取得できた場合、`(A2)`に`(B1)`を追加する。

3. ユーザー情報を登録及び更新処理を実施する。
  - ユーザー情報返却リスト`(A3)`を定義する。
  - ユーザー情報登録リスト`(A1)`を繰り返し、ユーザー情報`(B2)`を取得する
    - L_9001_003_ユーザー情報_登録APIを呼び出し、ユーザー情報`(B2)`を登録する。
      - INPUT:
        - ユーザー情報`(B2)`
      - OUTPUT:
         - ユーザー情報`(B3)`

    - ユーザー情報返却エンティティ`D1`を生成する
      - D1.ユーザー情報 = `(B3)`
      - D1.insertFlag = `insert`
    - `(A3)`に`(D1)`を追加する。

    - L_9001_004_ユーザー情報_登録APIを呼び出し、ユーザー情報`(B4)`を更新する。
      - INPUT:
        - ユーザー情報`(B4)`
      - OUTPUT:
         - ユーザー情報`(B5)`
    - D1を生成する
      - D1.ユーザー情報 = `(B5)`
      - D1.insertFlag = `update`
    - `(A3)`に`(D1)`を追加する。

4. `(A3)`リストを返却し、処理を処理を終了する。

## 共通処理
### ユーザー情報返却エンティティ
  - 下記の内容通りに、`ユーザー情報エンティティ`返却を定義する

  | No | ID | API名 | 備考 | 
  | :---: | --- | --- | --- |
  | 1   | UserInfo | ユーザー情報 |エンティティ|
  | 2   |insertFlag | 登録フラグ |値：insert/update|


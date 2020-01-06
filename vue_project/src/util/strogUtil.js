//暴露多个
const  TODO_key = 'token_key'
export default {
  saveToken (user){
    window.localStorage.setItem(TODO_key,JSON.stringify(user))
  },
  readToken(){
    return JSON.parse(window.localStorage.getItem(TODO_key) || '[]')
  }
}

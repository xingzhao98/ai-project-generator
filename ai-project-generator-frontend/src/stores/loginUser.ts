import { ref } from 'vue'
import { defineStore } from 'pinia'
import { getLoginUser } from '@/api/userController.ts'
import ACCESS_ENUM from '@/access/accessEnum.ts'

export const useLoginUserStore = defineStore('loginUser', () => {

  const loginUser = ref<API.LoginUserVO>({
    userName: '未登录',
    userRole: ACCESS_ENUM.NOT_LOGIN,
  })

  async function fetchLoginUser(){
    const res = await getLoginUser();
    if(res.data.code === 0 && res.data.data){
      loginUser.value = res.data.data
    }
  }

  function setLoginUser(newLoginUser: any){
    loginUser.value = newLoginUser
  }

  return { loginUser, fetchLoginUser, setLoginUser }
})

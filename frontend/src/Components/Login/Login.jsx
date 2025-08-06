import {FaUser, FaLock} from "react-icons/fa"
import {useState} from "react"
import "./Login.css"

export default function (){
    const [email, setEmail] = useState(null)
    const [password, setPassword] = useState(null)
    
    function handleForm(event){
        event.preventDefault()
        setEmail()



        console.log("Enviou!\n" 
                    + "email: " + email
                    + "password: " + password)
        



    }


    return( 
        <div className="container">
        <form onSubmit={handleForm} className="form">
            <h1 className="title"> Acesse o Sistema </h1>
            <div className="inp1">
                <input type="email" className="inputText" placeholder="Email: " autoComplete="user-name" onChange={(e) => setEmail(e.target.value)}/>
                <FaUser className='icon'></FaUser>
            </div>
            <div>
                <input type="password" className="inputText" autoComplete="current-password" placeholder="password:  " onChange={ (e) => setPassword(e.target.value)} />
                <FaLock className='icon'></FaLock>
            </div>
            <div>
              
                <label htmlFor="">Lembre de mim </label>
                  <input type="checkbox" name="" id="" />
                
                <a href="#" className="forgot">   esqueceu a senha? </a>
                

            </div>
            
            <div>
                <button className=""> Entrar </button>
            </div>
            <div className="signup">
                Não tem uma conta?
                <a href="#"> registrar </a>
            </div>
        </form>
        
        
        </div>
    )
}
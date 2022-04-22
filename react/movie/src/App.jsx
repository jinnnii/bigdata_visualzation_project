import Potato from './Potato';
import Test from './Test';
//import {Potato, name} from './Potato';

function App() {
    //컴포넌트의 부모 태그는 1개만 존재해야 한다
    // return 뒤에 사용되는 JSX 문법 중 단일 코드로 사용될 경우 괄호를 사용하지 않아도 된다
    // 2줄 이상의 내용을 입력할 경우 괄호 사용
    return (
        <div className="App">
            {/* Prop 을 사용하여 컴포넌트에 데이터 전달 */}
            {/* props 를 통해서 하위 컴포넌트로 데이터 전달 시 문자열은 "", 숫자 및 논리형, 배열, 오브젝트형 타입은 {} 로 감싸서 전달 */}
            <Potato like="chips" something={true} list={['hello', 1, 2, 3, true]} />
            Hello world
            <Test />
        </div>
    );
}

export default App;

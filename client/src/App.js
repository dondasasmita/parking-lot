import { render } from 'react-dom';
// import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
// import ErrorBoundary from './ErrorBoundary';

const App = () => {
	return (
		<div>
			<div>
				<h4>Enter an area of your choice</h4>
			</div>
			<div>
				<form>
					<h3>
						Area: <input type="text" placeholder="Enter an area" />
					</h3>
					<div>
						<button>Get Available Lots</button>
					</div>
					<div>
						<button>Reset</button>
					</div>
				</form>
			</div>
		</div>
	);
};

render(<App />, document.getElementById('root'));
